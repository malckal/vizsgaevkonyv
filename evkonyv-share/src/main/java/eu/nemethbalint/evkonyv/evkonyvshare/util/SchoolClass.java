package eu.nemethbalint.evkonyv.evkonyvshare.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchoolClass {
    private List<Student> studentList;
    private String className;
    private boolean graduation;
}
