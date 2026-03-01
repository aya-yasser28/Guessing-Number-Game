public class HardGame extends  Game {
    public HardGame(){
        System.out.println("Welcome to the hard level of Guessing Number Game!");
        setMaxAttempts((int) 5);
        setAttempts((int)0);
        generateSecretNum();
    }

    @Override
    public void generateSecretNum() {
        int generatedNum = (int) (Math.random()*101);
        setSecretNumber(generatedNum);
    }
}
