package eu.nemethbalint.evkonyv.evkonyvrest.service;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbSchoolClass;
import eu.nemethbalint.evkonyv.evkonyvrest.repository.DbSchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassService {

    @Autowired
    private DbSchoolClassRepository schoolClassRepository;

    public List<DbSchoolClass> getAll() {
         return schoolClassRepository.findAll();
    }
    public DbSchoolClass getOne(String className){
        return schoolClassRepository.findOneByClassName(className);
    }
}
