package pierzchala.watek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class SimplyRunnableService implements Lifecycle {


    private ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(1);


    @Autowired
    private SimplyRunnable simplyRunnable;



//    @PostConstruct //ta adnotacja powoduje, że metoda wykona się po uruchomieniu aplikacji
//    public void setup() {
//        threadPool.scheduleAtFixedRate(simplyRunnable, 5, 1, TimeUnit.SECONDS);
//    }

    @Override
    public void start() {
        threadPool.scheduleAtFixedRate(simplyRunnable, 5, 1, TimeUnit.SECONDS);

    }

    public void stop() {
        threadPool.shutdown();

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
        return threadPool.isTerminated();
    }
}
