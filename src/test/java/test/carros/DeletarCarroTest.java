package test.carros;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CarroPage;
import utils.BaseTest;
import static utils.StaticValues.DELETE_SUCCESS;

public class DeletarCarroTest extends BaseTest {

    @Test
    public void deveDeletarCarroExistente(){
        CarroPage carroPage = new CarroPage(driver);

        carroPage.deletar();

        String resultado = carroPage.resultadoInclusaoCarro();

        Assert.assertEquals(resultado, DELETE_SUCCESS);


    }
}
