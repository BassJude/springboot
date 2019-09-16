package pierzchala.eventlistener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @org.springframework.context.event.EventListener(ApplicationReadyEvent.class)
    public void start() {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
