package pierzchala.stos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Kolejka kolejka = new Kolejka();
        Kolejka kolejka2 = new Kolejka();

        int t;
        Kolejka.menu();
        System.out.println("Podaj liczbę:");

        while(in.hasNext()){

            t=in.nextInt();

            switch(t){
                case 0: Kolejka.menu(); break;
                case 1:
                    System.out.println("Dodaj liczbę całkowitą do kolejki:");
                    t=in.nextInt();
                    kolejka.add(t);
                    break;
                case 2: kolejka.delete();break;
                case 3: kolejka.show(); break;
                case 4: System.out.println(kolejka.zlicz());break;
                case 5: kolejka.copy(kolejka2);
                    kolejka2.show();
                    break;
                case 6: kolejka.scal(kolejka2);
                    break;
                case 7: System.exit(0);
            }
            System.out.println("Podaj liczbę:");
        }

    }
}
