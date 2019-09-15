package pierzchala.watki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemPrintRunnable2 implements Runnable {
    //

    @Autowired
    private SystemPrint1 systemPrint;

    @Override
    public void run() {

        System.out.println(systemPrint.getI());
        systemPrint.setI(systemPrint.getI()+1);


    }
}
