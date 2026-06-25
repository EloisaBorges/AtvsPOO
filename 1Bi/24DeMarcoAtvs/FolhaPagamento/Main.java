import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("Carlos (Base)", 2000.0));
        lista.add(new FuncionarioHorista("Ana (Horista)", 1000.0, 40, 50.0));
        lista.add(new FuncionarioComissionado("João (Comissionado)", 1500.0, 10000.0, 10.0)); // 10%
        lista.add(new FuncionarioBonificado("Maria (Bonificada)", 1500.0, 10000.0, 10.0, 500.0));

        FolhaDePagamento.processarPagamentos(lista);
    }
}