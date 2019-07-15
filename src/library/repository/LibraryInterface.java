package library.repository;

import library.entity.Book;

public interface LibraryInterface {
    void addBook(Book book);

    void deleteBook(String name);

    Book findBook(String name, String author);
}
