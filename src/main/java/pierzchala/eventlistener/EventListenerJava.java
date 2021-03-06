package pierzchala.eventlistener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EventListenerJava {
    /**
     * Funkcja ventListener odpala się przy starcie programu, tak samo jak @PostConstruct
     */

//    @org.springframework.context.event.EventListener(ApplicationReadyEvent.class)
    @EventListener(ApplicationReadyEvent.class)
    public void start() {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @PostConstruct
    public void start2() {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! POST Constructor");
    }
}
