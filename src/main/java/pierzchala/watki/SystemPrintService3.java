package pierzchala.watki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class SystemPrintService3 implements Lifecycle {

    private ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(3);

    @Autowired
    private SystemPrintRunnable2 systemPrintRunnable1;
    @Autowired
    private AdditionRunnable2 additionRunnable2;

//    @PostConstruct //ta adnotacja powoduje, że metoda wykona się po uruchomieniu aplikacji
//    public void setup() {
//        threadPool.scheduleAtFixedRate(systemPrintRunnable1, 3, 3, TimeUnit.SECONDS);
//        threadPool.submit(additionRunnable2);
//
//
//    }

    public void sendMessage(String message) {
        System.out.println("SEND");
    }




    public boolean isRunning() {

        return threadPool.isTerminated();
    }

    public void start() {

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

}
