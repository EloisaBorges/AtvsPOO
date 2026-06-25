public class Consulta {
    
    private Medico medico;
    private Prontuario prontuario;

    public Consulta(Medico medico, String descricaoProntuario) {
        this.medico = medico;
        this.prontuario = new Prontuario(descricaoProntuario);
    }

    public Medico getMedico() {
        return medico;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
}