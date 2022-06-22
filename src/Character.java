import java.util.HashMap;
import java.util.Scanner;

public class Character {

    public static Character character;
    HashMap<String, String> map = new HashMap<String, String>();

    Scanner scanner = new Scanner(System.in);

    public enum Jobs{
        KNIGHT("기사"),
        THIEF("도적"),
        MONK("수도승"),
        ARCHER("궁수")
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
        OAK("오크"),
        HUMAN("인간"),
        ELF("엘프"),
        DWARF("드워프")
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
    System.out.println("캐릭터를 생성합니다.");
    selectRace();


}

public void selectJobs(){

}

public void selectRace(){
    System.out.println("종족을 선택해 주세요");
    System.out.println("1.오크 2.인간 3.엘프 4.드워프");
    int race = scanner.nextInt();
    switch (race){
        case 1 :
            map.put("race", Race.OAK.name());
            System.out.println("당신의 종족은 오크입니다.");
            break;
        case 2:
            map.put("race", Race.HUMAN.name());
            System.out.println("당신의 종족은 인간 입니다.");
            break;
        case 3:
            map.put("race", Race.ELF.name());
            System.out.println("당신의 종족은 엘프입니다.");
            break;
        case 4:
            map.put("race", Race.DWARF.name());
            System.out.println("당신의 종족은 드워프입니다.");
            break;
    }
}



}
