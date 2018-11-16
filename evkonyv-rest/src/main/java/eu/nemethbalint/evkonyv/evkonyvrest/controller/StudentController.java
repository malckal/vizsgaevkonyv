package eu.nemethbalint.evkonyv.evkonyvrest.controller;

import eu.nemethbalint.evkonyv.evkonyvrest.service.StudentService;
import eu.nemethbalint.evkonyv.evkonyvshare.util.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diak")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{name}")
    public Student getOne(@PathVariable String name){
        return studentService.getOne(name);
    }
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
