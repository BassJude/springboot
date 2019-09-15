package pierzchala.test;

public class Main3 {
    public static void main(String[] args) {

        for (int i=0;i<100; i++) {
            double floor = Math.floor(Math.random() * 4);

            System.out.println(floor);

            double random2 = Math.random();
            System.out.println(random2);
            double floor1 = Math.floor(Math.random());
            System.out.println(floor1);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
