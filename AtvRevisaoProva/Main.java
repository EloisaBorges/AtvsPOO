package AtvRevisaoProva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

enum StatusLivro {
    DISPONIVEL,
    EMPRESTADO,
    MANUTENCAO
}

record Livro(String titulo, String autor, int ano) {}

class Biblioteca<T> {

    private ArrayList<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public void listar() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}

class Pessoa {
    public void apresentar() {
        System.out.println("Oi");
    }
}

class Bibliotecario extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Olá, sou o bibliotecário.");
    }
}

public class Main {

    public static void main(String[] args) {

        StatusLivro status = StatusLivro.DISPONIVEL;
        System.out.println("Status do livro: " + status);

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("A Nudez De Afrodite", "Cláudio Moreno", 2025);

        System.out.println("\nLivros criados:");
        System.out.println(livro1);
        System.out.println(livro2);

        Integer paginas = 320;
        int x = paginas;

        System.out.println("\nPaginas: " + paginas);
        System.out.println("Valor de x: " + x);

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Livro A", "Autor A", 2010));
        livros.add(new Livro("Livro B", "Autor B", 2014));
        livros.add(new Livro("Livro C", "Autor C", 2016));
        livros.add(new Livro("Livro D", "Autor D", 2020));
        livros.add(new Livro("Livro E", "Autor E", 2023));

        System.out.println("\nLista de livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Iterator<Livro> it = livros.iterator();

        while (it.hasNext()) {
            Livro livro = it.next();

            if (livro.ano() < 2015) {
                it.remove();
            }
        }

        System.out.println("\nLivros após remover os publicados antes de 2015:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);

        System.out.println("\nLista de inteiros:");
        System.out.println(lista);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("\nDigite o ano do livro: ");
            int ano = sc.nextInt();

            System.out.println("Ano informado: " + ano);

        } catch (InputMismatchException e) {
            System.out.println("Você deve digitar um número.");
        }

    
        LocalDate hoje = LocalDate.now();

        System.out.println("\nData atual: " + hoje);

        int anosPublicacao = hoje.getYear() - livro2.ano();

        System.out.println("O livro \"" + livro2.titulo()
                + "\" foi publicado há "
                + anosPublicacao + " anos.");

        Bibliotecario b = new Bibliotecario();
        System.out.println("\nExemplo de @Override:");
        b.apresentar();

     
        Biblioteca<Livro> biblioteca = new Biblioteca<>();

        biblioteca.adicionar(livro1);
        biblioteca.adicionar(livro2);

        System.out.println("\nBiblioteca:");
        biblioteca.listar();

        sc.close();
    }
}