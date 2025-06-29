package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "JPA_DOCTOR_INFO")
@Data
public class Doctor {
    @Id
    @Column(name = "DOC_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer doctorId;
    @Column(name = "DOC_NAME",length = 25)
    private String doctorName;
    @Column(name = "SPECIALIZATION",length = 25)
    private String specialization;
    @Column(name = "INCOME")
    private Double income;
}
