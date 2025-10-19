package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
    @Id
    @SequenceGenerator(name = "genrator", sequenceName = "AccSeq", allocationSize = 1, initialValue = 1000000)
    @GeneratedValue(generator = "genrator", strategy = GenerationType.SEQUENCE)
    private Long accountNumber;
    @NonNull
    private String holderName;
    @NonNull
    private Double balance;
    @NonNull
    private Long MobileNumber;
    @Version
    private Integer updateCount;
    @CreationTimestamp
    private LocalDateTime creationTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdationTime;
}
