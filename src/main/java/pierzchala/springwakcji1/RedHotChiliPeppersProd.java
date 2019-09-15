package pierzchala.springwakcji1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class RedHotChiliPeppersProd implements CompactDisc {
    private String title = "Can;t Stop";
    private String artist = "RHCP";

    @Override
    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}
