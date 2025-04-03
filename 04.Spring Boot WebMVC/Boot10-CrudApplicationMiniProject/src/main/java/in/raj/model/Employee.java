package in.raj.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table
public class Employee implements Serializable {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "emp_id_seq",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer empNo;
    @Column(length = 50)
    private String empName;
    @Column(length = 50)
    private String job;

    private float salary;

    private Integer deptNo;
}
