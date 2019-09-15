package pierzchala.springwakcji1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // można też uzyć w @BEAN w klasie konfiguracyjnej
public class RedHotChiliPeppersProd implements CompactDisc {
    private String title = "Can;t Stop";
    private String artist = "RHCP";

    @Override
    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}
