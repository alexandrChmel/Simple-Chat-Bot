import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c>=a && c<=b){
            System.out.println("Normal");
        } else if (c<=a) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}