package pierzchala.lambda;

public class Main1 {
    public static void main(String[] args) {

        Checker<Integer> idOddAnonymous = (object) -> object % 2 != 0;

        System.out.println(idOddAnonymous.check(123));
        System.out.println(idOddAnonymous.check(124));
    }

}
