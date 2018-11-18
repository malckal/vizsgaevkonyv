package eu.nemethbalint.evkonyv.evkonyvrest.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="diak")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DbStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="keresztnev")
    private String firstName;
    @Column(name="vezeteknev")
    private String lastName;
    @Column(name="szuletesidatum")
    private LocalDate birthDate;
    @ManyToOne
    @JoinColumn(name="osztalyid")
    private DbSchoolClass osztaly;


}
