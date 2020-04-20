package pierzchala.selenium.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.http.client.support.ProxyFactoryBean;

public class WebDriverProvider {

    public static WebDriver getInstance() {
        Proxy proxy = new Proxy();
        String httpProxy = proxy.getHttpProxy();
        proxy.setHttpProxy("localhost:8080");

        System.out.println("!!!!!!!!!!! "+httpProxy);
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver getDriverProxy(){

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        return new ChromeDriver(options);
    }
}
