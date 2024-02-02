public class Main {

    public static void main(String[] args) {

        int                               myVariable
                =
                50
                ;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable=50;myVariable--;System.out.println("myVariable = " + myVariable);

        // the code below started out the same as the example above (all statements on a single line).
        // Highlight (select) the line of code. Top menu choose 'Code' and then choose 'Reformat Code' to line it out so that it is more readable.
        int secondVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if(myVariable == 0){
            System.out.println("It's now zero");
        }
    }
}