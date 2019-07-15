package students;

import students.repository.Group;
import students.service.Impl.DemoServiceImpl;

public class StartStudents {
    public static void main(String[] args) {
        Group group = new Group(4);
        DemoServiceImpl demo = new DemoServiceImpl(group);
        demo.runDemo();
    }
}
