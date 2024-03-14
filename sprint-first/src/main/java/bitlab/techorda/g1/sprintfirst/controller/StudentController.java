package bitlab.techorda.g1.sprintfirst.controller;

import bitlab.techorda.g1.sprintfirst.db.DbManager;
import bitlab.techorda.g1.sprintfirst.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @GetMapping("/")
    public String index(Model model) {
        List<Student> students = DbManager.getAllStudents();
        model.addAttribute("students", students);
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        DbManager.addStudent(student);
        return "redirect:/";
    }
}
