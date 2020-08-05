package driver;

import exception.WrongUrlException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import static utils.PropertyLoader.retornarValorArquivoConfiguracao;

class CIDriverFactory{

    private final Capabilities capabilities;

    CIDriverFactory(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    WebDriver driver(){
        try {
            return new RemoteWebDriver(new URL(retornarValorArquivoConfiguracao("remote.url")), capabilities);
        } catch (MalformedURLException e) {
            throw new WrongUrlException("Não foi possível conectar no remoteWebDriver");
        }
    }

}
