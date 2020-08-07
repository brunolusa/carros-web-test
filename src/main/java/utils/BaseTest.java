package utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import report.ReportListener;
import static utils.PropertyLoader.retornarValorArquivoConfiguracao;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().criarInstancia();
        driver.get(retornarValorArquivoConfiguracao("url.base"));
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}