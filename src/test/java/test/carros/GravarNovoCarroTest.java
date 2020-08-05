package test.carros;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CarroPage;
import utils.BaseTest;

import static utils.StaticValues.ADD_SUCCESS;

public class GravarNovoCarroTest extends BaseTest {

    @Test()
    public void devePersistirNovoCarro() {
        CarroPage carroPage = new CarroPage(driver);

        carroPage.inserirMarca("Teste").inserirModelo("Teste").gravar();

        String resultado = carroPage.resultadoInclusaoCarro();

        Assert.assertEquals(resultado, ADD_SUCCESS);
    }
}
