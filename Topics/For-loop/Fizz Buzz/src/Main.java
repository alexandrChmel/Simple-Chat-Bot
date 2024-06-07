import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                                i % 3 == 0 ? "Fizz" :
                                i % 5 == 0 ? "Buzz" : i);
        }
    }
}