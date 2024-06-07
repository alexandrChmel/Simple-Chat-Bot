import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reese = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean onWeekend = reese <= 25 && reese >= 15;
        boolean offWeekend = reese <= 20 && reese >= 10;
        boolean isSucessful = (isWeekend && onWeekend) || (!isWeekend && offWeekend);
        System.out.println(isSucessful);
    }
}