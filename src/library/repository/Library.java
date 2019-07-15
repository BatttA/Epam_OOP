package library.repository;

import library.entity.Book;
import library.service.LibraryService;

public class Library implements LibraryService {
    private Book[] books;

    public Library(int bookquantity) {
        this.books = new Book[bookquantity];
    }

    @Override
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    @Override
    public void deleteBook(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(name)) {
                books[i] = null;
                break;
            }
        }
    }

    @Override
    public Book findBook(String name, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(name) && books[i].getAuthorBook().equals(author)) {
                return books[i];
            }
        }
        return null;
    }
}
