package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "JPA_TEACHER")
public class Teacher {
    @Id
    @SequenceGenerator(name = "gen1",initialValue =  1,allocationSize = 1,sequenceName = "tchrSqc")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
