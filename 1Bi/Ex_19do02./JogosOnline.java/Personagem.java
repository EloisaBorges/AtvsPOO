public class Personagem {
    private String nome;
    private Inventario inventario;
    private Guilda guilda;

    public Personagem(String nome) {
        
        this.nome = nome;
        this.inventario = new Inventario();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void entrarGuilda(Guilda guilda) {
        this.guilda = guilda;
        guilda.adicionarMembro(this);
    }

    public String getNome() {
        return nome;
    }
}