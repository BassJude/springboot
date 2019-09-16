package pierzchala.test;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        list.add("5555");
        list.forEach(System.out::println);

    }
}
