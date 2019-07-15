package students.service;

import students.entity.Student;
import students.repository.Group;

public class DemoService implements DemoInterface {
    Group group;

    public DemoService(Group group) {
        this.group = group;
    }

    @Override
    public void runDemo() {
        Student student = new Student(1, "Alexandr", "Zhuravlev", 4, 3, 2, 3);
        Student student1 = new Student(2, "Ilgiz", "Faizov", 5, 5, 5, 5);
        Student student2 = new Student(3, "Alexey", "Bolatov", 5, 2, 4, 5);
        Student student3 = new Student(4, "Alexandr", "Krivlev", 5, 2, 5, 5);

        MarksCalculationService marksCal = new MarksCalculationService();
        System.out.println("Средние оценки студентов:");
        System.out.println(marksCal.averStudentMark(student));
        System.out.println(marksCal.averStudentMark(student1));
        System.out.println(marksCal.averStudentMark(student2));
        System.out.println(marksCal.averStudentMark(student3));

        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        System.out.println("Средняя оценка группы:");
        System.out.println(marksCal.averGroupMark(group));

        CountService countService = new CountService();
        System.out.println("Колличество отличников:");
        System.out.println(countService.countSuccesfulStudents(group));
        System.out.println("Колличество студентов, имеющих неудовлетворительно:");
        System.out.println(countService.countUnsuccesfulStudents(group));
    }
}
