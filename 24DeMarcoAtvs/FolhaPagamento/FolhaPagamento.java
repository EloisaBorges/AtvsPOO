import java.util.List;

public class FolhaPagamento {
    public static void processarPagamentos(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário Final: R$ " + f.calcularSalario());
        }
    }
}