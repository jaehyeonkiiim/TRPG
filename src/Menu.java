import java.util.Scanner;

public class Menu {

    Scanner scanner;
    Interactive interactive;

    public Menu(){
        interactive = new Interactive();
        scanner = new Scanner(System.in);
    }

    public void mainMenu(){
        System.out.println("""
                -----------------------------------
                            ���� �޴�
                -----------------------------------""");
        System.out.println("1. ���� ���� 2. ���� ����");

        int menuNum = scanner.nextInt();
        switch (menuNum){
            case 1 -> interactive.createCharacter();
            case 2 -> System.exit(0);
        }

    }

}
