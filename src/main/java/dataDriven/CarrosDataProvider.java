package dataDriven;

import com.lusa.carros.model.Carro;
import dataFactory.CarrosFactory;
import org.testng.annotations.DataProvider;

public class CarrosDataProvider {

    @DataProvider
    public Object[][] novoCarro() {
        return new Carro[][]{
                {
                    new CarrosFactory().novoCarroRenaultSandero()
                },
                {
                    new CarrosFactory().novoCarroRenaultClio()
                },
                {
                    new CarrosFactory().novoCarroRenaultDuster()
                },
                {
                    new CarrosFactory().novoCarroRenaultMegane()
                }
        };
    }
}
