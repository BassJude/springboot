package pierzchala.watek;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class SimplyRunnable implements Runnable {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {

//        System.out.println(getI());
        setI(getI() + 1);

//        for (int i=0; i<=29999;i++) {
////        for (int i = 0; i < 99; i++) {
//
//            try {
//                FileWriter out = new FileWriter("writeFile.txt", true);
//                out.append(String.valueOf(i));
////                System.out.println(i);
//                out.append(" ");
//                if (i%20==0&&i!=0) {
//                    out.append("\n");
//                }
//                if (i==29999) {
//                    out.append("Koniec");
//                    out.append("\n");
//                }
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("Koniec fora: "+i);


    }
}
