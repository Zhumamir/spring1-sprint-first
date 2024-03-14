package bitlab.techorda.g1.sprintfirst.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    private Long id;
    private String fullName;
    private Integer age;
    private String birthPlace;
}
