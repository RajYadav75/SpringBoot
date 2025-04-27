package in.raj.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @SequenceGenerator(name = "Gen1" , allocationSize = 1 , initialValue = 1000)
    @GeneratedValue(generator = "Gen1", strategy = GenerationType.SEQUENCE)
    @Id
    private  Integer  id;
    @Column
    @NonNull
    private  String  name;

    @Column
    @NonNull
    private  String  addrs;

    @Column
    @NonNull
    private  String packageType;
    @NonNull
    private  Double  budget;
    @NonNull
    private LocalDateTime startDate;
    @NonNull
    private  LocalDateTime endDate;
}
