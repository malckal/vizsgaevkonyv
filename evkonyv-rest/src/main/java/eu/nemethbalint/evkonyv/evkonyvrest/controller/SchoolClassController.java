package eu.nemethbalint.evkonyv.evkonyvrest.controller;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbSchoolClass;
import eu.nemethbalint.evkonyv.evkonyvrest.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/osztaly")
public class SchoolClassController {
    @Autowired
    private SchoolClassService classService;

    @GetMapping
    public List<DbSchoolClass> getAll(){
        return classService.getAll();
    }
    @GetMapping("/{className}")
    public DbSchoolClass getOne(@PathVariable String className){
        return classService.getOne(className);
    }
}
