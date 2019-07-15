package library.service.Impl;

import library.entity.Book;
import library.repository.Impl.LibraryImpl;
import library.service.DemoInterface;

public class DemoServiceImpl implements DemoInterface {
    LibraryImpl library;

    public DemoServiceImpl(LibraryImpl library) {
        this.library = library;
    }

    @Override
    public void runTestStart() {
        library.addBook(new Book(1, "The Last of the Mohicans", "Roman", "James Fenimore Cooper"));
        library.addBook(new Book(2, "The Heart of a dog", "The story", "Mikhail Bulgakov"));
        library.addBook(new Book(3, "The Daughter of the Commandant", "Roman", "Alexander Sergeevich Pushkin"));
        library.addBook(new Book(4, "War and Peace", "Roman", "Lev Nikolaevich Tolstoy"));
        library.addBook(new Book(5, "Add me?", "Add me", "U add me?"));

        System.out.println("Поиск добавленных книг в библиотеке:");

        System.out.println(library.findBook("The Last of the Mohicans", "James Fenimore Cooper"));
        System.out.println(library.findBook("The Heart of a dog", "Mikhail Bulgakov"));
        System.out.println(library.findBook("The Daughter of the Commandant", "Alexander Sergeevich Pushkin"));
        System.out.println(library.findBook("War and Peace", "Lev Nikolaevich Tolstoy"));
        System.out.println(library.findBook("Add me?", "U add me?"));
        library.deleteBook("The Heart of a dog");

        library.addBook(new Book(5, "Add me?", "Add me", "U add me?"));

        System.out.println("Поиск удаленной и добавленной книг в библиотеке:");

        System.out.println(library.findBook("The Heart of a dog", "Mikhail Bulgakov"));
        System.out.println(library.findBook("Add me?", "U add me?"));

        library.deleteBook("Add me?");

        library.addBook(new Book(2, "The Heart of a dog", "The story", "Mikhail Bulgakov"));

        System.out.println("Поиск конечного списка книг в библиотеке:");

        System.out.println(library.findBook("The Last of the Mohicans", "James Fenimore Cooper"));
        System.out.println(library.findBook("The Heart of a dog", "Mikhail Bulgakov"));
        System.out.println(library.findBook("The Daughter of the Commandant", "Alexander Sergeevich Pushkin"));
        System.out.println(library.findBook("Add me?", "U add me?"));
    }
}
