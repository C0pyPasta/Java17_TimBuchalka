public class Main {

    public static void main(String[] args) {

        displayHighscorePosition("Tim", calculateHighScorePosition(1500));
        displayHighscorePosition("Jim", calculateHighScorePosition(1000));
        displayHighscorePosition("Tom", calculateHighScorePosition(500));
        displayHighscorePosition("Bob", calculateHighScorePosition(100));
        displayHighscorePosition("Jill", calculateHighScorePosition(25));
    }

    public static void displayHighscorePosition(String name, int position){

        System.out.println(name + " managed to get into position " + position + " on the high score list" );
    }

    public static int calculateHighScorePosition(int score){

        int position = 4;

        if(score >= 1000){
            position = 1;
        } else if(score >= 500){
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }

        return position;
    }
}