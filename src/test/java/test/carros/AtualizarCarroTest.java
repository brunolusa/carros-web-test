package test.carros;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CarroPage;
import utils.BaseTest;
import static utils.StaticValues.UPDATE_SUCCESS;

public class AtualizarCarroTest extends BaseTest {

    @Test
    public void deveAtualizarCarroExistente(){
        CarroPage carroPage = new CarroPage(driver);

        carroPage.atualizar().inserirMarca("Nova marca").inserirModelo("Novo modelo").gravar();

        String resultado = carroPage.resultadoInclusaoCarro();

        Assert.assertEquals(resultado, UPDATE_SUCCESS);


    }
}
