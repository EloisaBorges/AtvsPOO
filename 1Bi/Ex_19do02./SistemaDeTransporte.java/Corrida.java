public class Corrida {
    
    private String origem;
    private String destino;
    private Pagamento pagamento;

    public Corrida(String origem, String destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.pagamento = new Pagamento(valor);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}