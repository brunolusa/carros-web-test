package dataFactory;

import com.lusa.carros.model.Carro;

public class CarrosFactory {

    public Carro novoCarroRenaultSandero(){ return Carro.builder().marca("Renault").modelo("Sandero").build(); }
    public Carro novoCarroRenaultMegane(){ return Carro.builder().marca("Renault").modelo("Megane").build(); }
    public Carro novoCarroRenaultDuster(){ return Carro.builder().marca("Renault").modelo("Duster").build(); }
    public Carro novoCarroRenaultClio(){ return Carro.builder().marca("Renault").modelo("Clio").build(); }

}
