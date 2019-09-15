package pierzchala.springbootfirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pierzchala.springwakcji1.CompactDisc;
import pierzchala.springwakcji1.RedHotChiliPeppersProd;
import pierzchala.springwakcji1.SgtPeppersDev;

@Configuration
@ComponentScan("pierzchala")
public class AppConfig {

    // zamiast automatycznie skanować możemy jawnie zadeklarować Beana
    // tutaj deklarujemy beany, których nie mamy w projekcie, nie wiemy skąd ich wziąźć
    @Bean
    @Primary
    public CompactDisc getRightComponent() {
        if (System.getenv("mock") != null) {
            return new SgtPeppersDev();
        } else {
            return new RedHotChiliPeppersProd();
        }
    }

}
