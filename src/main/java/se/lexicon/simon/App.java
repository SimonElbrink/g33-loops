package se.lexicon.simon;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Do-While
        // Code runs atleast ones.
        do {
            System.out.println("How old are you?");

            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("you are an adult!");
            } else {
                System.out.println("you are a child");
                break;
            }
        } while (false);


    }
}
