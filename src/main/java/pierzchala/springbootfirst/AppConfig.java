package pierzchala.springbootfirst;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pierzchala")
public class AppConfig {

    // zamiast automatycznie skanować możemy jawnie zadeklarować Beana
    // tutaj deklarujemy beany, których nie mamy w projekcie, nie wiemy skąd ich wziąźć
//    @Bean
//    @Primary
//    public CompactDisc sgtPeppers() {
//        if (System.getenv("mock")!=null) {
//            return new SgtPeppers();
//
//        } else {
//            return new RedHotChiliPeppers();
//        }
//
//    }

}
