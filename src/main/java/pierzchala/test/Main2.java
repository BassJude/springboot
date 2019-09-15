package pierzchala.test;

public class Main2 {
    public static void main(String[] args) {

        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
