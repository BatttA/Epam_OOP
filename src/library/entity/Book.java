package library.entity;

public class Book {
    private int idBook;
    private String nameBook;
    private String genreBook;
    private String authorBook;

    public Book(int idBook, String nameBook, String genreBook, String authorBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.genreBook = genreBook;
        this.authorBook = authorBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getGenreBook(){
        return genreBook;
    }
    public String getAuthorBook() {
        return authorBook;
    }

    @Override
    public String toString() {
        return  "Id: " + idBook +
                ", Name: '" + nameBook + '\'' +
                ", Genre: '" + genreBook + '\'' +
                ", Author: " + authorBook;
    }
}
