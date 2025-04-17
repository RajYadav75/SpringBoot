package in.raj.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.crypto.SealedObject;

@Data
@Entity
@Table
public class RoomMate {
    @Id
    @SequenceGenerator(name = "gen1", sequenceName = "EMP_ID_SEQ",initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer no;
    private String name;
    private  String job="CLERK";
    private  Double sal;
    private  String  status="active";
    private  Integer  deptno;
}
