package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "JPA_FRIENDS")
@Data
public class Friends {
    @Id
    @SequenceGenerator(name = "gen1",initialValue =  1,allocationSize = 1,sequenceName = "frdsqc")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer id;
    private String name;
    private Double salary;
    private Long phno;
    private String email;
}