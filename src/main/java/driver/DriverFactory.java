package driver;

import envoriment.EnvironmentInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    CIDriverFactory ciDriverFactory;
    ChromeLocalDriverFactory chromeLocalDriverFactory;

    public DriverFactory() {
        ChromeOptions chromeOptions = new ChromeOptionsFactory().build();
        ciDriverFactory = new CIDriverFactory(chromeOptions);
        chromeLocalDriverFactory = new ChromeLocalDriverFactory(chromeOptions);
    }

    public WebDriver criarInstancia(){
        if(EnvironmentInfo.isRunningOnCI()){
            return ciDriverFactory.driver();
        }
        return chromeLocalDriverFactory.driver();
    }
}
