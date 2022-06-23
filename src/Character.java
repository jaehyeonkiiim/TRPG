import java.util.HashMap;
import java.util.Scanner;

public class Character {

    public static Character character;
    Status status = new Status();
    HashMap<String, String> characterMap = new HashMap<String, String>();

    Scanner scanner = new Scanner(System.in);

    public enum Jobs{
        KNIGHT, THIEF, MONK, ARCHER
        }

    public enum Race{
        OAK, HUMAN, ELF, DWARF
    }

public void createCharacter(){
    System.out.println("ĳ���͸� �����մϴ�.");
    selectRace();
    selectJobs();
    setStatus();
}

public void selectJobs(){
    System.out.println("������ ������ �ּ���");
    System.out.println("1.��� 2.���� 3.������ 4.�ü�");
    int jobs = scanner.nextInt();
    switch (jobs) {
        case 1 -> {
            characterMap.put("jobs", Jobs.KNIGHT.name());
            System.out.println("����� ������ ����Դϴ�.\n");
        }
        case 2 -> {
            characterMap.put("jobs", Jobs.THIEF.name());
            System.out.println("����� ������ �����Դϴ�.\n");
        }
        case 3 -> {
            characterMap.put("jobs", Jobs.MONK.name());
            System.out.println("����� ������ �������Դϴ�.\n");
        }
        case 4 -> {
            characterMap.put("jobs", Jobs.ARCHER.name());
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
            characterMap.put("race", Race.OAK.name());
            System.out.println("����� ������ ��ũ�Դϴ�.\n");
        }
        case 2 -> {
            characterMap.put("race", Race.HUMAN.name());
            System.out.println("����� ������ �ΰ� �Դϴ�.\n");
        }
        case 3 -> {
            characterMap.put("race", Race.ELF.name());
            System.out.println("����� ������ �����Դϴ�.\n");
        }
        case 4 -> {
            characterMap.put("race", Race.DWARF.name());
            System.out.println("����� ������ ������Դϴ�.\n");
        }
    }
}

    public HashMap<String, String> getCharacterMap() {
        return characterMap;
    }

    public void setStatus(){
        if (characterMap.get("race").equals("OAK")){
            System.out.println("test oak");
        }
    }
}
