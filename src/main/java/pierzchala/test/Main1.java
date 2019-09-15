package pierzchala.test;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main1 {
    public static void main(String[] args) {

        for (int i = 0; i < 99; i++) {

            try {
                FileWriter out = new FileWriter("writeFile.txt", true); //!! uwaga, na drugi parametr dopisywanie true, nadpisywanie false
                out.append(String.valueOf(i));
                out.append("\n");
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
