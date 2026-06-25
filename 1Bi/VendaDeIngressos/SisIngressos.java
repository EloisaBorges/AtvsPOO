package VendaDeIngressos;

public class SisIngressos {
    public static void main(String[] args) {
        System.out.println("--- Exemplo Camarote VIP ---");
        CamaroteVip cv = new CamaroteVip(150.0, 100.0, "Setor Ouro - Bloco A");
        
        cv.mostrarValoresSeparados();
        cv.imprimirLocalizacao();

        System.out.println("\n--- Exemplo Camarote Inferior ---");
        CamaroteInferior ci = new CamaroteInferior(150.0, "Setor Prata - Fila 10");
        
        System.out.println("Valor: R$ " + ci.consultarValor());
        ci.imprimirLocalizacao();
    }
}