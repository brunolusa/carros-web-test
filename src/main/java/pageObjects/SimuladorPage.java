package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SimuladorPage {

    private WebDriver driver;

    public SimuladorPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ("input[value='paraVoce']"))
    private WebElement paraVoce;

    @FindBy(css = ("input[value='paraEmpresa']"))
    private WebElement paraEmpresa;

    @FindBy(id = "valorAplicar")
    private WebElement valorAplicar;

    @FindBy(id = "valorInvestir")
    private WebElement valorInvestir;

    @FindBy(id = "tempo")
    private WebElement tempo;

    @FindBy(css = ".btSelect")
    private WebElement selecionarTempo;

    @FindBy(css = ".listaSelect li a[rel='M']")
    private WebElement meses;

    @FindBy(css = ".listaSelect li a[rel='A']")
    private WebElement anos;

    @FindBy(css = ".simular")
    private WebElement submit;

    @FindBy(css = ".valor")
    private WebElement valorSimulado;

    public SimuladorPage paraVoce(){
        paraVoce.click();
        return this;
    }

    public SimuladorPage paraEmpresa(){
        paraEmpresa.click();
        return this;
    }

    public SimuladorPage aplicarInicialmente(String value){
        valorAplicar.sendKeys(value);
        return this;
    }

    public SimuladorPage investindoMensalmente(String value){
        valorInvestir.sendKeys(value);
        return this;
    }

    public SimuladorPage durante(String value){
        tempo.sendKeys(value);
        return this;
    }

    public SimuladorPage meses(){
        selecionarTempo.click();
        aguardaElemento(meses).click();
        return this;
    }

    public SimuladorPage anos(){
        selecionarTempo.click();
        aguardaElemento(anos).click();
        return this;
    }

    public SimuladorPage simular(){
        submit.click();
        return this;
    }


    public String resultadoSimulacao(){
        return aguardaElemento(valorSimulado).getText();
    }
    private WebElement aguardaElemento(WebElement webElement) {
        int tempoDeEspera = 10;
        WebDriverWait explicitWaitByElement = new WebDriverWait(driver, tempoDeEspera);
        explicitWaitByElement.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;

    }

}
