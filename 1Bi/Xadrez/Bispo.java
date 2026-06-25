public class Bispo extends Peca {

    public Bispo(String cor, Posicao posicaoInicial) {
        super(cor, posicaoInicial);
    }

    public void mover(Posicao destino) {
        int passosLinha = Math.abs(destino.linha - this.posicaoAtual.linha);
        int passosColuna = Math.abs(destino.coluna - this.posicaoAtual.coluna);

        if (passosLinha == passosColuna) {
            System.out
                    .println("O Bispo " + cor + " andou em diagonal para a linha " + destino.linha + ", coluna " + destino.coluna);
            this.posicaoAtual = destino;
        } else {
            System.out.println("Posição inválida!");
        }
    }
}