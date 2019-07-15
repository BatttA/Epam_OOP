package library;

import library.repository.Library;
import library.service.DemoService;

public class StartLibrary {
    public static void main(String[] args) {
        Library library = new Library(4);
        DemoService demoService = new DemoService(library);
        demoService.runTestStart();
    }
}
