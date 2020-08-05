package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarroPage {

    private WebDriver driver;

    public CarroPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "marca")
    private WebElement marca;

    @FindBy(id = "modelo")
    private WebElement modelo;

    @FindBy(id = "save")
    private WebElement gravar;

    @FindBy(css = ".valor")
    private WebElement mensagemSucesso;


    public CarroPage inserirMarca(String value){
        marca.sendKeys(value);
        return this;
    }

    public CarroPage inserirModelo(String value){
        modelo.sendKeys(value);
        return this;
    }

    public CarroPage gravar(){
        gravar.click();
        return this;
    }

    public String resultadoInclusaoCarro(){
        return aguardarMensagem(mensagemSucesso).getText();
    }

    private WebElement aguardarMensagem(WebElement webElement) {
        int tempoDeEspera = 10;
        WebDriverWait explicitWaitByElement = new WebDriverWait(driver, tempoDeEspera);
        explicitWaitByElement.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;

    }
}
