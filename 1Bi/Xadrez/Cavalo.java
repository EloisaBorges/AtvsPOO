public class Cavalo extends Peca {

    public Cavalo(String cor, Posicao posicaoInicial) {
        super(cor, posicaoInicial);
    }

    public void mover(Posicao destino) {
        int passosLinha = Math.abs(destino.linha - this.posicaoAtual.linha);
        int passosColuna = Math.abs(destino.coluna - this.posicaoAtual.coluna);

        if ((passosLinha == 2 && passosColuna == 1) || (passosLinha == 1 && passosColuna == 2)) {
            System.out
                    .println("O Cavalo " + cor + " andou em 'L' para a linha " + destino.linha + ", coluna " + destino.coluna);
            this.posicaoAtual = destino;
        } else {
            System.out.println("Posição inválida!");
        }
    }
}