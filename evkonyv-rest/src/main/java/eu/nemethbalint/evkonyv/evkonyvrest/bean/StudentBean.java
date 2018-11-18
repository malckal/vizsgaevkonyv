package eu.nemethbalint.evkonyv.evkonyvrest.bean;

import eu.nemethbalint.evkonyv.evkonyvrest.database.DbStudent;
import eu.nemethbalint.evkonyv.evkonyvrest.helper.PictureConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentBean {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String picture;

    public static List<StudentBean> convertToBean(List<DbStudent> list) {
        return list.stream()
                .map(s -> {
                    return StudentBean.builder()
                            .picture(PictureConverter.clobToString(s.getPicture()))
                            .birthDate(s.getBirthDate())
                            .firstName(s.getFirstName())
                            .lastName(s.getLastName())
                            .build();
                })
                .collect(Collectors.toList());
    }
}
