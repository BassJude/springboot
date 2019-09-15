package pierzchala.lambda;

import java.util.Map;

public class Main1 {
    public static void main(String[] args) {

        Checker<Integer> idOddAnonymous = (object) -> object % 2 != 0;
        Runnable r = () -> System.out.println("555");

        System.out.println(idOddAnonymous.check(123));
        System.out.println(idOddAnonymous.check(124));
        r.run();
        Map<String, String> getenv = System.getenv();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
