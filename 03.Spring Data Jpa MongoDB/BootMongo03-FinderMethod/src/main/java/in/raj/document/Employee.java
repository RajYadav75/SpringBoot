package in.raj.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee_Doc")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
    /*
        @Id
        private String employId;
    */
    @NonNull
    @Id
    private Integer employNumber;
    @NonNull
    private String employName;
    @NonNull
    private String employAddress;
    @NonNull
    private Double employSalary;
    @NonNull
    private Boolean isEmployVaccinated;
}
