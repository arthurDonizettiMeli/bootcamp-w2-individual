package Exercicio3;

import java.util.UUID;

public class Book {
  private String id;
  private String titulo;
  private String isbn;
  private String autor;
  private StatusBook status;

  public Book() {
  }

  public Book(String titulo, String isbn, String autor) {
    this.id = UUID.randomUUID().toString();
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor = autor;
    this.status = StatusBook.DISPONIVEL;
  }

  public void Emprestimo() {
    if (estaDisponivel()) {
      this.status = StatusBook.EMPRESTADO;
    }
  }

  public void Devolver() {
    this.status = StatusBook.DISPONIVEL;
  }

  private boolean estaDisponivel() {
    return this.status.equals(StatusBook.DISPONIVEL);
  }

  // tostring não é herdado da superclasse então não consegue realizar Override. Java é case sensitive
  @Override
  public String toString() {
    return titulo + ", " + isbn + ", " + autor+" -- "+ status;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatusBook getStatus() {
    return status;
  }

  public void setStatus(StatusBook status) {
    this.status = status;
  }

  public static void main(String[] args) {
    Book b1 = new Book("Livro 1", "0123456789", "Autor 1");
    Book b2 = new Book("Livro 2", "9876543210", "Autor 2");

    b1.Emprestimo();
    System.out.println(b1);

    System.out.println(b2);

    b1.Devolver();
    System.out.println(b1);
  }
}
