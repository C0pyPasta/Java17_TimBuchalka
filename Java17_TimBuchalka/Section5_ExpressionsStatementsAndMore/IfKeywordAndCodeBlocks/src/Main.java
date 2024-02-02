public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int secondScore = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000){
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }
        // Same but using Ternary Operation
        System.out.println(score < 5000 ? "true" : "false");


        if(secondScore < 5000 && secondScore > 1000){
            System.out.println("Your secondScore was less than 5000 but greater than 1000");
        } else if(secondScore < 1000){
            System.out.println("Your secondScore was less than 1000");
        } else {
            System.out.println("Got here");
        }

    }
}