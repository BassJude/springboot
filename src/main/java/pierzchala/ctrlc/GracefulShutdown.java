package pierzchala.ctrlc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class GracefulShutdown implements ApplicationListener<ContextClosedEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GracefulShutdown.class);
    private final TomcatGracefulShutdownConnector gracefulShutdown;

    public GracefulShutdown(final TomcatGracefulShutdownConnector gracefulShutdown) {
        this.gracefulShutdown = gracefulShutdown;
    }

    @Override
    public void onApplicationEvent(final ContextClosedEvent contextClosedEvent) {
        try {
            final ThreadPoolExecutor threadPoolExecutor = gracefulShutdown.threadPoolExecutor().orElseThrow(IllegalStateException::new);
            threadPoolExecutor.shutdown();
            if (!threadPoolExecutor.awaitTermination(30, TimeUnit.SECONDS)) {
                LOGGER.error("Not graceful");
            } else {
                LOGGER.info("Graceful");
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
