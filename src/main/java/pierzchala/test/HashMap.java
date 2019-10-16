package pierzchala.test;

import com.google.gson.internal.LinkedHashTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap {

    private int number;
    private String word;
    private boolean check;


    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(3, "Super");
        map.put("Super", 35);
        map.put(Color.BLACK, "not Pink");
        map.put(4, "Super");

        Set keySet = map.keySet();
        for (Object key : keySet) {
            System.out.println("Key: " + key + " | Value: " + map.get(key));
        }
        System.out.println("!!!!!!!");
        // entrySet w kluczu przechowuje klucz i wartość
        Set entrySet = map.entrySet();
        for (Object key : entrySet) {
            System.out.println("Key: " + key + " | Value: " + map.get(key));
        }
        System.out.println("!!!!!!!");
        for (Object key : entrySet) {
            System.out.println(key);
        }
        System.out.println("!!!!!!!");
        Map<Integer, String> integerStringMap = new LinkedHashTreeMap<>();
        String number1 = integerStringMap.put(35, "Trzydzieści pięć");
        String number2 = integerStringMap.put(12, "Dwanaście");
        String number3 = integerStringMap.put(5, "Pięć");

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }


}
