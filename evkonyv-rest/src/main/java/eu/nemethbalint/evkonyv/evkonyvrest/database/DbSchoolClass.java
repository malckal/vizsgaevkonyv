package eu.nemethbalint.evkonyv.evkonyvrest.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="osztaly")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DbSchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="osztalynev")
    private String className;
    @OneToMany(mappedBy = "osztaly")
    private List<DbStudent> studentList;
    @Column(name="vegzososztaly")
    private boolean graduation;
    @Column(name="tanev")
    private int schoolyear;

}
