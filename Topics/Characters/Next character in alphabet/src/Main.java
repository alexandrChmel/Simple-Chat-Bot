import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input character
        char inputChar = scanner.next().charAt(0);


        if (inputChar == 'z'){
            System.out.println('a');
        }
        else{
            char outputChar = inputChar += 1;
            System.out.println(outputChar);
        }

        // Print the result

    }
}