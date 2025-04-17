package in.raj.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Dept {
    @Id
    @GeneratedValue
    private Integer deptno;
    private  String dname;
    private   String loc;
}
