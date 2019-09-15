package pierzchala.watek1;

public class Watek1Runnable implements Runnable {



    private Integer counter;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
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
