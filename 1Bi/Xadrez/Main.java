import java.util.Scanner;

public class Main {
    static final Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        Posicao lugarDoCavalo = new Posicao(1, 2);
        Cavalo meuCavalo = new Cavalo("Branco", lugarDoCavalo);

        System.out.println("Próxima posição do Cavalo Branco");
        System.out.print("Linha: ");
        int linhaDigitada = LER.nextInt();
        System.out.print("Coluna: ");
        int colunaDigitada = LER.nextInt();

        Posicao destinoDoJogador = new Posicao(linhaDigitada, colunaDigitada);
        meuCavalo.mover(destinoDoJogador);
    }
}