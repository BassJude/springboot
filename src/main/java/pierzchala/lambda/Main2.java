package pierzchala.lambda;

public class Main2 {

    private static int count=0;

    public static void main(String[] args) {

        Runnable r = ()->{System.out.println(count);
            count++;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t = new Thread(r);



        System.out.println("Poczatek");

        t.start();
        Thread thread = Thread.currentThread();

        System.out.println( thread.getState());


//        t.start();




        System.out.println("Koniec");
        System.out.println( thread.getState());


    }
}
