package pierzchala.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootfirstApplication extends SpringBootServletInitializer {
    private static String[] args;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootfirstApplication.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootfirstApplication.class, args);
        SpringbootfirstApplication.args = args;

    }

    public static String[] getArgs() {
        return args;
    }
}
