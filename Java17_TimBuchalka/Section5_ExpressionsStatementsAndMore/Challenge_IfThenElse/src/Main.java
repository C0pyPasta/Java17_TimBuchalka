public class Main {

    public static void main(String[] args) {
        //++++++++++++++++++++++++++++++++++++++++++++++++ REPLACE THIS ++++++++++++++++++++++++++++++++++++++++++++++++
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        //----------------------------------
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //---------------------------------- DUPLICATED CODE!

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        //----------------------------------
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //---------------------------------- DUPLICATED CODE!
        //++++++++++++++++++++++++++++++++++++++++++++++++ REPLACE THIS ++++++++++++++++++++++++++++++++++++++++++++++++

        //+++++++++++++++++++++++++++++++++++++++++++++++++ WITH THIS ++++++++++++++++++++++++++++++++++++++++++++++++++
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        //+++++++++++++++++++++++++++++++++++++++++++++++++ WITH THIS ++++++++++++++++++++++++++++++++++++++++++++++++++
    }
    // To avoid code duplication you can use a method (if you need to change the code you would only need to do it here)
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}