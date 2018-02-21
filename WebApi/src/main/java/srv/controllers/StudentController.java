package srv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.StudentEntity;
import srv.models.StudentModel;
import srv.services.StudentService;

/**
 * @author GeorgeMD
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(params = {"email", "password"})
    public StudentModel login(@RequestParam(name = "email") String email,
                              @RequestParam(name = "password") String password) {
        StudentEntity entity = studentService.login(email, password);
        return new StudentModel(entity);
    }
}
