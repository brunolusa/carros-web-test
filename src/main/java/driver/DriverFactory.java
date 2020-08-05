package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    ChromeLocalDriverFactory chromeLocalDriverFactory;

    public DriverFactory() {
        ChromeOptions chromeOptions = new ChromeOptionsFactory().build();
        chromeLocalDriverFactory = new ChromeLocalDriverFactory(chromeOptions);
    }

    public WebDriver criarInstancia(){
        return chromeLocalDriverFactory.driver();
    }
}
