package VendaDeIngressos;

public class CamaroteInferior extends Ingresso {
    private String localizacao;

    public CamaroteInferior(double valorBase, String localizacao) {
        super(valorBase);
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização do Camarote: " + localizacao);
    }
}