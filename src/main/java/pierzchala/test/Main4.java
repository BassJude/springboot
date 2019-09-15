package pierzchala.test;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number=0;

        System.out.println("Podaj liczbę: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podaj liczbę");

        }
        number = scanner.nextInt();
        System.out.println("Wpisałeś: "+number);
    }
}
