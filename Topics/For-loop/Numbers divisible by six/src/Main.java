import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int num;

        for (int i = 0; i<n ; i++) {
            num = scanner.nextInt();
            if (num % 6 ==0){
                sum += num;
            }

        }
        System.out.println(sum);

    }
}