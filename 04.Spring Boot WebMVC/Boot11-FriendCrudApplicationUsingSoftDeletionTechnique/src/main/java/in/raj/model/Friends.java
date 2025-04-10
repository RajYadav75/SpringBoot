package in.raj.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Friends")
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;
    private String address;
}
