import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Getting the input from the user
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String result = input % 5 == 0 && input % 3 == 0 ? "FizzBuzz":
                        input % 5 == 0 ? "Fizz" :
                        input % 3 == 0 ? "Buzz": Integer.toString(input) ;

        System.out.println(result);
    }
}