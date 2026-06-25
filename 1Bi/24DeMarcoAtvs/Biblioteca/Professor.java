public class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, String dataNasc, String departamento) {
        super(nome, dataNasc);
        this.departamento = departamento;
    }

    public Professor() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}