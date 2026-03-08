import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        System.out.println("=============== Welcome to the  GUESSING NUMBER GAME ! ================");
        while(menu) {
            System.out.println("Choose the difficulty level of the game :");
            System.out.println("1. Easy Game");
            System.out.println("2. Hard Game");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Game game1 = new EasyGame();
                    game1.play();
                    break;
                case 2:
                    Game game2 = new HardGame();
                    game2.play();
                    break;
                case 3:
                    System.out.println("Have a good day!");
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
