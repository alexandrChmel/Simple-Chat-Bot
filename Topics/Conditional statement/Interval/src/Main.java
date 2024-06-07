import java.util.Scanner;

class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                //      (−15,12]∪(14,17)∪[19,+∞);

                if (num>-15 && num<=12){
                        System.out.println("True");
                }
                else {
                     if (num>14 && num<17){
                             System.out.println("True");
                     }
                     else {
                             if (num >= 19){
                                 System.out.println("True");
                             }
                             else {
                                 System.out.println("False");
                             }
                     }
                }
        }
}