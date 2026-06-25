import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Produto> produtos;
    private NotaFiscal notaFiscal;

    public Pedido(String numeroNota) {
        this.produtos = new ArrayList<>();
        this.notaFiscal = new NotaFiscal(numeroNota);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}