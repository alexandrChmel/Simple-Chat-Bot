import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean i = (num1 == num2) || (num1 == num3) || (num2 == num3);
        System.out.println(!i);
    }
}