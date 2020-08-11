package test.carros;

import dataDriven.CarrosDataProvider;
import org.testng.Assert;
import com.lusa.carros.model.Carro;
import org.testng.annotations.Test;
import pageObjects.CarroPage;
import utils.BaseTest;
import static utils.StaticValues.ADD_SUCCESS;

public class GravarNovoCarroTest extends BaseTest {

    @Test(dataProvider = "novoCarro", dataProviderClass = CarrosDataProvider.class)
    public void devePersistirNovoCarro(Carro carro) {
        CarroPage carroPage = new CarroPage(driver);

        carroPage.inserirMarca(carro.getMarca()).inserirModelo(carro.getModelo()).gravar();

        String resultado = carroPage.resultadoInclusaoCarro();

        Assert.assertEquals(resultado, ADD_SUCCESS);
    }
}
