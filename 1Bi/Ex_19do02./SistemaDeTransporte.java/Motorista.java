import java.util.ArrayList;
import java.util.List;

public class Motorista {
    
    private String nome;
    private List<Corrida> corridas;

    public Motorista(String nome) {
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