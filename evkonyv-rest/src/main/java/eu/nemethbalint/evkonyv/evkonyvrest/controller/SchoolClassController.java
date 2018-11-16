package eu.nemethbalint.evkonyv.evkonyvrest.controller;

import eu.nemethbalint.evkonyv.evkonyvrest.service.SchoolClassService;
import eu.nemethbalint.evkonyv.evkonyvshare.util.SchoolClass;
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
    public List<SchoolClass> getAll(){
        return classService.getAll();
    }
    @GetMapping("/{className}")
    public SchoolClass getOne(@PathVariable String className){
        return classService.getOne(className);
    }
}
