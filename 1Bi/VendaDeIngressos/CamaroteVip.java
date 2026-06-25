package VendaDeIngressos;

public class CamaroteVip extends IngressoVip {
    private String localizacao;

    public CamaroteVip(double valorBase, double taxaVip, String localizacao) {
        super(valorBase, taxaVip);
        this.localizacao = localizacao;
    }

    public void mostrarValoresSeparados() {
        System.out.println("Detalhamento:");
        System.out.println("- Valor Base: R$ " + valorBase);
        System.out.println("- Taxa VIP: R$ " + taxaVip);
        System.out.println("- Valor Total: R$ " + consultarValor());
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização Camarote VIP: " + localizacao);
    }
}