package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        String name = "Botic";
        int createYear = 2024;
        System.out.printf("Hello! My name is %s.\nI was created in %d.\n", name, createYear);
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String namePeople = scanner.next();
        System.out.printf("What a great name you have, %s!", namePeople);
        scanner.close();

    }
}
