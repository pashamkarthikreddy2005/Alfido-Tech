import java.util.*;

class karthik_random {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;

        System.out.println("GUESS A NUMBER BETWEEN 1 AND 100");

        while (true) {
            int num = sc.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (num < random) {
                System.out.println("Guess a higher number\nTRY AGAIN");
            } else if (num > random) {
                System.out.println("Guess a lower number\nTRY AGAIN");
            } else {
                System.out.println("YOU HAVE GUESSED IT RIGHT");
                break;
            }
        }

        sc.close();
    }
}