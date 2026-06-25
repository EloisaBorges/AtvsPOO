import java.util.ArrayList;
import java.util.List;

import DAO.Conexao;

public class Perfil {
    
    private String nome;
    private List<Conexao> conteudosAssistidos;

    public Perfil(String nome) {
        this.nome = nome;
        this.conteudosAssistidos = new ArrayList<>();
    }

    public void assistirConteudo(Conexao conteudo) {
        conteudosAssistidos.add(conteudo);
    }

    public List<Conexao> getConteudosAssistidos() {
        return conteudosAssistidos;
    }

    public String getNome() {
        return nome;
    }
}