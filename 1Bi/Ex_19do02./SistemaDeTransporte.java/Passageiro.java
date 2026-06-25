import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    
    private String nome;
    private List<Corrida> corridas;

    public Passageiro(String nome) {
        this.nome = nome;
        corridas = new ArrayList<>();
    }

    public void adicionarCorrida(Corrida c) {
        corridas.add(c);
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }
}