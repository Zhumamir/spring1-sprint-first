package bitlab.techorda.g1.sprintfirst.db;

import bitlab.techorda.g1.sprintfirst.model.Developer;
import bitlab.techorda.g1.sprintfirst.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DbManager {
    private static List<Student> students = new ArrayList<>();
    private static Long id = 1L;

    static {
        students.add(new Student(id++, "Иван", "Иванов", 85));
        students.add(new Student(id++, "Петр", "Петров", 70));
        students.add(new Student(id++, "Мария", "Сидорова", 95));
    }

    public static void addStudent(Student student) {
        student.setId(id++);
        student.setMark(calculateMark(student.getExam()));
        students.add(student);
    }

    public static Student getStudentById(Long id) {
        return students.stream()
                .filter(student -> Objects.equals(student.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> getAllStudents() {
        return students;
    }

    private static String calculateMark(int exam) {
        if (exam >= 90) {
            return "A";
        } else if (exam >= 75) {
            return "B";
        } else if (exam >= 60) {
            return "C";
        } else if (exam >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
