package FichaPratica09Ex07;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private String categoria;
    private int isbn;

    public Livro(String titulo, String autor, int numeroDePaginas, String categoria, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.categoria = categoria;
        this.isbn = isbn;
    }

    public void  exibirDetalhes(){
        System.out.println(this.titulo+ " | "+this.autor+" | "+this.numeroDePaginas+" | "+this.categoria+" | "+this.isbn);
    }

}


