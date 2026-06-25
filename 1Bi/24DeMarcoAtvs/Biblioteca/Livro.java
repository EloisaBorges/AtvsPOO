public class Livro {
    private String titulo;
    private String edicao;
    private int ano;
    private String editora;
    private String[] listaAutores;
    private int qtdAcervo;

    public Livro(String titulo, String edicao, int ano, String editora, String[] listaAutores, int qtdAcervo) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.editora = editora;
        this.listaAutores = listaAutores;
        this.qtdAcervo = qtdAcervo;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String[] getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(String[] listaAutores) {
        this.listaAutores = listaAutores;
    }

    public int getQtdAcervo() {
        return qtdAcervo;
    }

    public void setQtdAcervo(int qtdAcervo) {
        this.qtdAcervo = qtdAcervo;
    }
}