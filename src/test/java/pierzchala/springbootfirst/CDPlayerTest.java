package pierzchala.springbootfirst;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pierzchala.springwakcji1.CompactDisc;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringbootfirstApplication.class)
@ActiveProfiles("dev") // dzieki temu laduje jedną klasę
public class CDPlayerTest {

    /**
     *
     * Klasa CDPlayerTest wykorzystuje klasę Springa SpringJUnit4ClassRunner do automatycz-
     * nego utworzenia kontekstu aplikacji po uruchomieniu testu. Adnotacja @ContextConfi
     *  guration informuje Springa, że konfiguracja kontekstu ma zostać wczytana z klasy
     * CDPlayerConfig . Klasa konfiguracji opatrzona jest adnotacją @ComponentScan , dzięki czemu
     * otrzymany kontekst aplikacji powinien zawierać komponent CompactDisc .
     */

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotToBeNull() {
        assertNotNull(compactDisc);

        System.out.println("!!!!!!!!!!!!!!!!!!!");
        System.out.println(compactDisc.getClass().getName());
    }
}
