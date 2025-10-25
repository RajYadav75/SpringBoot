package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "OneToOne_DrivingLicence")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "person")
public class DrivingLicence {
    @Id
    private String drivingLicenceId;
    @NonNull
    private String drivingLicenceType;
    @NonNull
    private LocalDate issueDate;
    @NonNull
    private LocalDate expiryDate;
    private Person person;
}
