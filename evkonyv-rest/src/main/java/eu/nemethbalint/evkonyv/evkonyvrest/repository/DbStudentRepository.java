package eu.nemethbalint.evkonyv.evkonyvrest.repository;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbStudentRepository extends JpaRepository<DbStudent, Integer> {

    DbStudent findOneByLastNameAndFirstName(String lastName, String firstName);
}
