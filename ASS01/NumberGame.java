import java.io.*;
import java.util.*;

public class NumberGame {
    public static void main(String[] args) throws Exception {
        Random n = new Random();
        int RadNo = n.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("How many chances You want to guess? (Max 10)");
                int g = sc.nextInt();

                if (g > 10) {
                    System.out.println("Plz Enter the Chances less than 10");
                    continue;
                }

                System.out.println(RadNo);
                System.out.println("Guess the Number (Note: You have " + g + " Chances only) ");

                for (int i = g; i >= 1; i--) {
                    System.out.print("Guess the Number :");
                    int Num = sc.nextInt();

                    if (Num == RadNo) {
                        System.out.println("Your guess is correct " + Num);
                        System.out.println();
                    } else if ((Num - RadNo) <= 30) {
                        System.out.println("Your guess is too high...");
                        System.out.println();
                    } else {
                        System.out.println("Your guess is too low...");
                        System.out.println();
                    }

                    System.out.println("(Note: You have " + (i - 1) + " Chances only) ");

                }
                System.out.println();
                System.out.println("Do you want see the number ?(y/n)");
                char ch = sc.next().charAt(0);
                if (ch == 'y') {
                    System.out.println("The number is "+g);
            
                }

                System.out.println("Do you want to play the game Again...?(y/n)");
                char st = sc.next().charAt(0);
                if (st != 'y') {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Some Error Occurs " + e);
                System.exit(0);
            }

        }

    }

}
