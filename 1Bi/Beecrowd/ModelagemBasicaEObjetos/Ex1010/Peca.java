package Beecrowd.ModelagemBasicaEObjetos.Ex1010;

public class Peca {
    private int codigo;
    private int quantidade;
    private double valorUnitario;

    public Peca(int codigo, int quantidade, double valorUnitario) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.valorUnitario;
    }

    // Getters e Setters caso precise expandir o sistema depois
    public int getCodigo() { return codigo; }
    public int getQuantidade() { return quantidade; }
    public double getValorUnitario() { return valorUnitario; }
}