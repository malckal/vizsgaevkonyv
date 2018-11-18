package eu.nemethbalint.evkonyv.evkonyvrest.controller;

import eu.nemethbalint.evkonyv.evkonyvrest.bean.StudentBean;
import eu.nemethbalint.evkonyv.evkonyvrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/tanulo")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{name}")
    public StudentBean getOne(@PathVariable String name){

        return studentService.getOne(name);
    }
    @GetMapping
    public List<StudentBean> getAll(){
        return studentService.getAll();
    }
}
