import java.util.Scanner;

public class Akinator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer;
        int count = 0;

        System.out.println("=== Classroom Friend Akinator ===");
        System.out.println("Think of one of your classroom friends.");
        System.out.println("Answer only in yes or no.");
        System.out.println();

        count++;
        System.out.print("Does this friend sit on the front bench? ");
        answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            count++;
            System.out.print("Does this friend always complete homework on time? ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("I guess... This friend is a Topper type!");
            } else {
                System.out.println("I guess... This friend is the Class Monitor type!");
            }

        } else {

            count++;
            System.out.print("Does this friend make the class laugh? ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("I guess... This friend is the Funny type!");
            } else {
                System.out.println("I guess... This friend is the Silent type!");
            }
        }

        System.out.println();
        System.out.println("I guessed your friend type in " + count + " question(s).");
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
