import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {

            String grade = scanner.next();
            int result = grade.equals("A") ? a++ :
                        grade.equals("B") ? b++ :
                                grade.equals("C") ? c++ : d++;

        }
        System.out.printf("%d %d %d %d", d, c, b, a);
    }
}