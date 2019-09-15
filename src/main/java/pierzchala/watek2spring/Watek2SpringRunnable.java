package pierzchala.watek2spring;

import org.springframework.stereotype.Component;

@Component
public class Watek2SpringRunnable implements Runnable {

    private int counter=5;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("test");
        counter();

    }

    public void counter() {
        for (int i = 0; i < counter; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}
