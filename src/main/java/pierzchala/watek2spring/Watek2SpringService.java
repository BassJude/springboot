package pierzchala.watek2spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Service;

@Service
public class Watek2SpringService implements Lifecycle {

    @Autowired
    private Watek2SpringRunnable watek2SpringRunnable;

    @Override
    public void start() {
watek2SpringRunnable.run();

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
