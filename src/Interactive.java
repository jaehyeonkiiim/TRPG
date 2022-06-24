import java.util.Scanner;

public class Interactive {

    Character character;
    Scanner scanner;
    public static final String KEY_JOB = "jobs";
    public static final String KEY_RACE = "race";


    public Interactive(){
        character = new Character();
        scanner = new Scanner(System.in);
    }

    public void createCharacter(){
        selectRace();
        selectJobs();
    }

    public void selectJobs(){
        System.out.println("������ ������ �ּ���");
        System.out.println("1.��� 2.���� 3.������ 4.�ü�");
        int jobs = scanner.nextInt();
        switch (jobs) {
            case 1 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.KNIGHT.name());
                System.out.println("����� ������ ����Դϴ�.\n");

            }
            case 2 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.THIEF.name());
                System.out.println("����� ������ �����Դϴ�.\n");
            }
            case 3 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.MONK.name());
                System.out.println("����� ������ �������Դϴ�.\n");
            }
            case 4 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.ARCHER.name());
                System.out.println("����� ������ �ü��Դϴ�.\n");
            }
        }
    }

    public void selectRace(){
        System.out.println("������ ������ �ּ���");
        System.out.println("1.��ũ 2.�ΰ� 3.���� 4.�����");
        int race = scanner.nextInt();
        switch (race) {
            case 1 -> {
                Character.characterMap.put("race", Character.Race.OAK.name());
                System.out.println("����� ������ ��ũ�Դϴ�.\n");
            }
            case 2 -> {
                Character.characterMap.put("race", Character.Race.HUMAN.name());
                System.out.println("����� ������ �ΰ� �Դϴ�.\n");
            }
            case 3 -> {
                Character.characterMap.put("race", Character.Race.ELF.name());
                System.out.println("����� ������ �����Դϴ�.\n");
            }
            case 4 -> {
                Character.characterMap.put("race", Character.Race.DWARF.name());
                System.out.println("����� ������ ������Դϴ�.\n");
            }
        }
    }
}
