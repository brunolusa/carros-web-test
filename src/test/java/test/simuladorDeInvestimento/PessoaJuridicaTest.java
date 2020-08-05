package test.simuladorDeInvestimento;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SimuladorPage;
import utils.BaseTest;

public class PessoaJuridicaTest extends BaseTest {

    @Test()
    public void deveriaAplicarDuranteAnos() {
        SimuladorPage simulador = new SimuladorPage(driver);
        simulador.paraEmpresa().aplicarInicialmente("20.00").investindoMensalmente("100.00").durante("12").anos().simular();
        String resultadoObtido = simulador.resultadoSimulacao();

        Assert.assertEquals(resultadoObtido,"R$ 15.853");
    }

    @Test()
    public void deveriaAplicarDuranteMeses() {
        SimuladorPage simulador = new SimuladorPage(driver);
        simulador.paraEmpresa().aplicarInicialmente("20.00").investindoMensalmente("100.00").durante("12").meses().simular();
        String resultadoObtido = simulador.resultadoSimulacao();

        Assert.assertEquals(resultadoObtido,"R$ 1.229");
    }
}
