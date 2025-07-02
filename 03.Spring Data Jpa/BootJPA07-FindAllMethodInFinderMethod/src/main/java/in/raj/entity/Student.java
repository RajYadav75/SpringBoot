package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "JPA_STUDENT")
public class Student {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "sdtSeq",initialValue = 1,allocationSize=1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String password;
    private Long mobileNumber;
}
