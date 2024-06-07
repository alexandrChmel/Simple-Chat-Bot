import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lower = scanner.nextDouble();
        double higher = scanner.nextDouble();
        double sum = 0;
        double n = 0;

        for (; lower<=higher; lower++){
            if (lower % 3 == 0){
                n++;
                sum += lower;
            }
        }

        System.out.println(sum/n);
    }
}