package manager;



import persistencia.BancoDados;
import modelos.Infraestrutura;

import java.util.List;

public class InfraestruturaManager {

    // Adiciona uma nova infraestrutura
    public void cadastrar(Infraestrutura i) {
        BancoDados.infraestruturas.add(i);
    }

    // Lista todas as infraestruturas
    public List<Infraestrutura> listar() {
        return BancoDados.infraestruturas;
    }
}
