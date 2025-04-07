package in.raj.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "emp")
public class Employee implements Serializable {
    @Id
    @SequenceGenerator(name="gen1",sequenceName = "EMP_ID_SEQ",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Integer empno;
    private String ename;
    private  String job="Java Developer";
    private  Double sal;
}
