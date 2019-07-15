package students.service.Impl;

import students.entity.Student;
import students.entity.StudentProgress;
import students.repository.Group;
import students.service.DemoInterface;

public class DemoServiceImpl implements DemoInterface {
    Group group;

    public DemoServiceImpl(Group group) {
        this.group = group;
    }

    @Override
    public void runDemo() {
        Student student = new Student(1, "Alexandr", "Zhuravlev", new StudentProgress(new int[]{2, 3, 2, 4}));
        Student student1 = new Student(2, "Ilgiz", "Faizov", new StudentProgress(new int[]{2, 3, 2, 4}));
        Student student2 = new Student(3, "Alexey", "Bolatov", new StudentProgress(new int[]{5, 3, 5, 4}));
        Student student3 = new Student(4, "Alexandr", "Krizhavlev", new StudentProgress(new int[]{2, 3, 2, 4}));
        Student student4 = new Student(5, "Gilgamesh", "Zaifov", new StudentProgress(new int[]{5, 5, 5, 5}));

        MarksCalculationServiceImpl marksCal = new MarksCalculationServiceImpl();
        System.out.println("Средние оценки студентов:");
        System.out.println(marksCal.averStudentMark(student));
        System.out.println(marksCal.averStudentMark(student1));
        System.out.println(marksCal.averStudentMark(student2));
        System.out.println(marksCal.averStudentMark(student3));
        System.out.println(marksCal.averStudentMark(student3));

        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);

        System.out.println("Список группы:");

        for (int i = 0; i < group.getStudents().length; i++) {
            System.out.println(group.getStudents()[i]);
        }

        group.deleteStudent(4);

        group.addStudent(student4);

        System.out.println("Измененный список группы:");

        for (int i = 0; i < group.getStudents().length; i++) {
            System.out.println(group.getStudents()[i]);
        }
        System.out.println("Средняя оценка группы:");
        System.out.println(marksCal.averGroupMark(group));

        CountServiceImpl countService = new CountServiceImpl();
        System.out.println("Количество отличников:");
        System.out.println(countService.countSuccesfulStudents(group));
        System.out.println("Количество студентов, имеющих неудовлетворительно:");
        System.out.println(countService.countUnsuccesfulStudents(group));
    }
}
