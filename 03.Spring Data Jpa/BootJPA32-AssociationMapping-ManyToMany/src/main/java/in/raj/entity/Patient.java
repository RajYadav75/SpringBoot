package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Patient implements Serializable {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "sq1",allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
    private Integer patientId;

    @NonNull
    private String patientName;

    @NonNull
    private Integer patientAge;

    @NonNull
    private String patientProblem;
    @ManyToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "JPA_MTM_DOCTORS_PATIENTS",joinColumns = @JoinColumn(name = "patient_id",referencedColumnName = "patientId"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id",referencedColumnName = "doctorId")
    )
    private List<Doctor> doctors;
    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientProblem='" + patientProblem + '\'' +
                '}';
    }
}
