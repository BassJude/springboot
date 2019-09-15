package pierzchala.watki;

import org.springframework.stereotype.Component;

@Component
public class AdditionRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Drugi");
    }
}
