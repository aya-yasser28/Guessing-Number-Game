public class EasyGame extends Game {
    public EasyGame(){
        System.out.println("Welcome to the easy level of Guessing Number Game!");
        setMaxAttempts((int) 10);
        setAttempts((int)0);
        generateSecretNum();
    }

    @Override
    public void generateSecretNum() {
        int generatedNum = (int) (Math.random() * 51);
        setSecretNumber(generatedNum);
    }
}
