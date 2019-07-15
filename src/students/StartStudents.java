package students;

import students.repository.Group;
import students.service.DemoService;

public class StartStudents {
    public static void main(String[] args) {
        Group group = new Group(4);
        DemoService demo = new DemoService(group);
        demo.runDemo();
    }
}
