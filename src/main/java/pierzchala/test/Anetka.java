package pierzchala.test;

import pierzchala.ext.Grandchild;

import java.util.Arrays;
import java.util.Scanner;

public class Anetka {
    public static void main(String[] args) {

        String word = "0123456789qwertyuioasdfghjklzxcvbnm,";
        byte[] bytes = word.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
    }
}
