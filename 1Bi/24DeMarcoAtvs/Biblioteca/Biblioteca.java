public class Biblioteca {
    private String nomeBiblioteca;
    private String endereco;
    private Livro[] listaLivros;

    public Biblioteca(String nomeBiblioteca, String endereco, Livro[] listaLivros) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.listaLivros = listaLivros;
    }

    public Biblioteca() {
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(Livro[] listaLivros) {
        this.listaLivros = listaLivros;
    }
}