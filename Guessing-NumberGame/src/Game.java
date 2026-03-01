import java.util.Scanner;

public class Game {
    private int secretNumber;
    private int maxAttempts;
    private int attempts;


    public void setSecretNumber(int num) {
        this.secretNumber = num;
    }

    public int getSecretNumber() {
        return secretNumber;
    }


    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }


    public void setMaxAttempts(int maxAttempts) {

        this.maxAttempts = maxAttempts;
    }

    public int getMaxAttempts() {

        return maxAttempts;
    }

    public void generateSecretNum() {}
    public  boolean checkNum(int playerNumber){

        return playerNumber == getSecretNumber();
    }

    public boolean isGameOver(){

        return getAttempts() == getMaxAttempts();
    }

    public void play(){
        Scanner input = new Scanner(System.in);

        while(!isGameOver()){
            System.out.println("Enter your guess :");
            int playerNumber = input.nextInt() ;
            setAttempts((int)(getAttempts()+1));
            if(checkNum(playerNumber)){
                System.out.println("Congratulations! you won💃🎉");
                return;
            }
            else if (playerNumber > getSecretNumber())
            {
                System.out.println("the number is smaller than that😒");
            }
            else
            {
                System.out.println("the number is greater than that😒");
            }
        }
        System.out.println("the game is over the number was:" +getSecretNumber());
    }
}