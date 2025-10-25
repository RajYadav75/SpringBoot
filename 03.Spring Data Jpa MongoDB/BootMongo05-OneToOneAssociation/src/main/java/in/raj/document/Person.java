package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OneToOne_Person")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "drivingLicence")
public class Person {
    @Id
    private String personId;
    @NonNull
    private String personName;
    @NonNull
    private String personAddress;
    @NonNull
    private Integer personAge;
    private DrivingLicence drivingLicence;
}
