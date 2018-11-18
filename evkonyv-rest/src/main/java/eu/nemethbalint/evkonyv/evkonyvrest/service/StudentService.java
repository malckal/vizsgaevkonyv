package eu.nemethbalint.evkonyv.evkonyvrest.service;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbStudent;
import eu.nemethbalint.evkonyv.evkonyvrest.repository.DbStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private DbStudentRepository studentRepository;

    public DbStudent getOne(String name) {
        return null;
    }

    public List<DbStudent> getAll() {
        return studentRepository.findAll();
    }
}
