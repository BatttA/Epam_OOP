package students.entity;

import java.util.Arrays;

public class StudentProgress {
    private int[] marks = new int[4];

    public StudentProgress(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Оценки: " + Arrays.toString(marks);
    }
}
