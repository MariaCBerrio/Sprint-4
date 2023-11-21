package com.udea.clase19.controllers;
import com.udea.clase19.entity.Student;
import com.udea.clase19.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
        }
        return "index";
    }
    @GetMapping("/students")
    public String student(Model model){
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "student";
    }
    @GetMapping("/students/newStudent")
    public String newStudent(Model model){
        model.addAttribute("students", new Student());
        return "newStudent";
    }
    @GetMapping("/student/edit/{id}")
    public String editStudent(@PathVariable Integer id, Model model){
        Student student = studentService.getStudentById(id);
        if (student != null){
            model.addAttribute("student", student);
            return "editStudent";
        }else{
            return "redirect:/students";
        }

    }
}

