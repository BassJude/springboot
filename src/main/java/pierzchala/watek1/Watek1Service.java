package pierzchala.watek1;

import org.springframework.context.Lifecycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Watek1Service implements Lifecycle {

    private ExecutorService watek1 = Executors.newCachedThreadPool();
    private Watek1Runnable watek1Runnable;

    public Watek1Runnable getWatek1Runnable() {
        return watek1Runnable;
    }

    public void setWatek1Runnable(Watek1Runnable watek1Runnable) {
        this.watek1Runnable = watek1Runnable;
    }

    @Override
    public void start() {
        watek1.submit(watek1Runnable);

    }

    public void stop() {
        watek1.shutdown();
        while (isRunning()) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isRunning() {
        return watek1.isTerminated();
    }
}
