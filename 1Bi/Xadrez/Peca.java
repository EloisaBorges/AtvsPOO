public abstract class Peca implements Movimento {
    String cor;
    Posicao posicaoAtual;

    public Peca(String cor, Posicao posicaoInicial) {
        this.cor = cor;
        this.posicaoAtual = posicaoInicial;
    }
}