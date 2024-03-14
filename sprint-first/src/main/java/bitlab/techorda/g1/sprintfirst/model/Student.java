package bitlab.techorda.g1.sprintfirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

    public Student(Long id, String name, String surname, int exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = calculateMark(exam);
    }

    public String calculateMark(int exam) {
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
