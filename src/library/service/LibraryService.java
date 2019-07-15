package library.service;

import library.entity.Book;

public interface LibraryService {
    void addBook(Book book);

    void deleteBook(String name);

    Book findBook(String name, String author);
}
