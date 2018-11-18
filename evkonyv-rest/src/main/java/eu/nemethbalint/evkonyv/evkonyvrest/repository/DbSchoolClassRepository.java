package eu.nemethbalint.evkonyv.evkonyvrest.repository;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbSchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbSchoolClassRepository extends JpaRepository<DbSchoolClass, Integer> {
}
