import java.util.Scanner;  // Required to read user input

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input
        int num = scanner.nextInt();

        // Put your code with ternary operator here
        System.out.println(num == 10 ? "Equal" : "Not Equal");
    }
}