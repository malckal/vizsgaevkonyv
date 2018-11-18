package eu.nemethbalint.evkonyv.evkonyvrest.service;

import eu.nemethbalint.evkonyv.evkonyvrest.bean.StudentBean;
import eu.nemethbalint.evkonyv.evkonyvrest.database.DbStudent;
import eu.nemethbalint.evkonyv.evkonyvrest.helper.PictureConverter;
import eu.nemethbalint.evkonyv.evkonyvrest.repository.DbStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private DbStudentRepository studentRepository;

    public StudentBean getOne(String name) {

        String lastname = name.split("-")[0];
        String firstname = name.split("-")[1];
        DbStudent tmp = studentRepository.findOneByLastNameAndFirstName(lastname, firstname);
        return StudentBean.builder()
                .firstName(tmp.getFirstName())
                .lastName(tmp.getLastName())
                .birthDate(tmp.getBirthDate())
                .picture(PictureConverter.clobToString(tmp.getPicture()))
                .build();

    }

    public List<StudentBean> getAll() {
        return StudentBean.convertToBean(studentRepository.findAll());
    }
}
