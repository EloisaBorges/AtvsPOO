import java.util.ArrayList;
import java.util.List;

public class Usuario<Perfil> {
    
    private String nome;
    private List<Perfil> perfis;

    public Usuario(String nome) {
        this.nome = nome;
        this.perfis = new ArrayList<>();
    }

    public void adicionarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public String getNome() {
        return nome;
    }
}