package eu.nemethbalint.evkonyv.evkonyvrest;


import eu.nemethbalint.evkonyv.evkonyvrest.database.DbSchoolClass;
import eu.nemethbalint.evkonyv.evkonyvrest.database.DbStudent;
import eu.nemethbalint.evkonyv.evkonyvrest.repository.DbSchoolClassRepository;
import eu.nemethbalint.evkonyv.evkonyvrest.repository.DbStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EvkonyvServerApplication implements CommandLineRunner {

    @Autowired
    private DbStudentRepository studentRepository;
    @Autowired
    private DbSchoolClassRepository schoolClassRepository;
    public static void main(String... args){
        SpringApplication.run(EvkonyvServerApplication.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        List<DbStudent> list = new ArrayList<>();
        list.add(DbStudent.builder()
        .firstName("Bálint")
        .lastName("Németh")
        .birthDate(LocalDate.of(1996,2,3))
        .build());
        list.add(DbStudent.builder()
        .firstName("Mátyás")
        .lastName("Tolnai")
        .birthDate(LocalDate.of(1996,1,16)
        ).build());
        studentRepository.saveAll(list);
        schoolClassRepository.save(DbSchoolClass.builder()
                .className("13.G")
                .studentList(list)
                .graduation(true)
                .schoolyear(2018)
                .build());
        list=new ArrayList<>();
        list.add(DbStudent.builder()
        .firstName("Péter")
        .lastName("Laki")
        .birthDate(LocalDate.of(2000,7,1))
        .build());
        studentRepository.saveAll(list);
        schoolClassRepository.save(DbSchoolClass.builder()
                .className("11.D")
                .studentList(list)
                .graduation(false)
                .schoolyear(2018)
                .build());
    }
}
