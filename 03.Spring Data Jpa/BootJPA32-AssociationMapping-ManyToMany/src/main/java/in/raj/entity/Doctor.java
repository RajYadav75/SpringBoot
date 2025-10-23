package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer doctorId;
    @NonNull
    private String doctorName;
    @NonNull
    private String specialization;

    @ManyToMany(targetEntity = Patient.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "JPA_MTM_DOCTORS_PATIENTS",joinColumns = @JoinColumn(name = "doctor_id",referencedColumnName = "doctorId"),
    inverseJoinColumns = @JoinColumn(name = "patient_id",referencedColumnName = "patientId"))
    private List<Patient> patients;
    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
