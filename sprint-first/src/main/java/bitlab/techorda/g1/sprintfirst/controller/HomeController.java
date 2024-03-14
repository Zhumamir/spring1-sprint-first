package bitlab.techorda.g1.sprintfirst.controller;

import bitlab.techorda.g1.sprintfirst.db.DbManager;
import bitlab.techorda.g1.sprintfirst.model.Developer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
//    @GetMapping("/") // WebServlet("/")
//    public String homePage(Model model) {
//        List<Developer> developers = DbManager.getDevelopers();
//        model.addAttribute("razraby", developers); // req.setAttribute("razraby", developers")
//        return "home"; // req.getRequestDispatcher("home.jsp").forward(req,resp)
//    }
//
//    @GetMapping("/developer/{id}")
//    public String detailsPage(@PathVariable Long id) {
//        System.out.println(id);
//        return "details";
//    }
//
//    @PostMapping("/developers/add")
//    public String addDeveloper(Developer developer) {
//        DbManager.createDeveloper(developer);
//        return "redirect:/"; // resp.sendRedirect("/")
//    }
}
