package library.repository.Impl;

import library.entity.Book;
import library.repository.LibraryInterface;

public class LibraryImpl implements LibraryInterface {
    private Book[] books;

    public LibraryImpl(int bookquantity) {
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
