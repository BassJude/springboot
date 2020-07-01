package pierzchala.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        method1();
    }

    private static void method1() {
        Checker<Integer> idOddAnonymous = (object) -> object % 2 != 0;
        System.out.println(idOddAnonymous.check(123));
        System.out.println(idOddAnonymous.check(124));
    }

    private static void method2() {
        List<String> names = Arrays.asList("Wojtek", "Ania", "Magda", "Zosia");
    }

}
