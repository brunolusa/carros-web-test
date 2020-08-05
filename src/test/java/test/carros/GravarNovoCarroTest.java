package test.carros;

import org.testng.annotations.Test;
import pageObjects.CarroPage;
import utils.BaseTest;

public class GravarNovoCarroTest extends BaseTest {

    @Test()
    public void devePersistirNovoCarro() {
        CarroPage carroPage = new CarroPage(driver);

        carroPage.inserirMarca("Teste").inserirModelo("Teste").gravar();

    }
}
