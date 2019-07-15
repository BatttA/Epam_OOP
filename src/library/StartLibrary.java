package library;

import library.repository.Impl.LibraryImpl;
import library.service.Impl.DemoServiceImpl;

public class StartLibrary {
    public static void main(String[] args) {
        LibraryImpl library = new LibraryImpl(4);
        DemoServiceImpl demoService = new DemoServiceImpl(library);
        demoService.runTestStart();
    }
}
