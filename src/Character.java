import java.util.HashMap;
import java.util.Scanner;

public class Character {

    public static Character character;
    HashMap<String, String> map = new HashMap<String, String>();

    Scanner scanner = new Scanner(System.in);

    public enum Jobs{
        KNIGHT("���"),
        THIEF("����"),
        MONK("������"),
        ARCHER("�ü�")
        ;

        private final String label;
        Jobs(String label) {
            this.label = label;
        }

        public String label(){
            return label;
        }
    }

    public enum Race{
        OAK("��ũ"),
        HUMAN("�ΰ�"),
        ELF("����"),
        DWARF("�����")
        ;

        private final String label;
        Race(String label) {
            this.label = label;
        }
        public String label(){
            return label;
        }
    }

public void createCharacter(){
    System.out.println("ĳ���͸� �����մϴ�.");
    selectRace();
    selectJobs();

}

public void selectJobs(){
    System.out.println("������ ������ �ּ���");
    System.out.println("1.��� 2.���� 3.������ 4.�ü�");
    int jobs = scanner.nextInt();
    switch (jobs){
        case 1 :
            map.put("jobs", Jobs.KNIGHT.name());
            System.out.println("����� ������ ����Դϴ�.");
            break;
        case 2:
            map.put("jobs", Jobs.THIEF.name());
            System.out.println("����� ������ �����Դϴ�.");
            break;
        case 3:
            map.put("jobs", Jobs.MONK.name());
            System.out.println("����� ������ �������Դϴ�.");
            break;
        case 4:
            map.put("jobs", Jobs.ARCHER.name());
            System.out.println("����� ������ �ü��Դϴ�.");
            break;
    }
}

public void selectRace(){
    System.out.println("������ ������ �ּ���");
    System.out.println("1.��ũ 2.�ΰ� 3.���� 4.�����");
    int race = scanner.nextInt();
    switch (race){
        case 1 :
            map.put("race", Race.OAK.name());
            System.out.println("����� ������ ��ũ�Դϴ�.");
            break;
        case 2:
            map.put("race", Race.HUMAN.name());
            System.out.println("����� ������ �ΰ� �Դϴ�.");
            break;
        case 3:
            map.put("race", Race.ELF.name());
            System.out.println("����� ������ �����Դϴ�.");
            break;
        case 4:
            map.put("race", Race.DWARF.name());
            System.out.println("����� ������ ������Դϴ�.");
            break;
    }
}



}
