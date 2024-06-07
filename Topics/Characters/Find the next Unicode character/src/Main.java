import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new scanner object for user input
        Scanner input = new Scanner(System.in);

        // Waiting for user input
        char inputChar = input.next().charAt(0);


        // Performsdf operation on character here and print the result
        System.out.println(++inputChar);


    }
}