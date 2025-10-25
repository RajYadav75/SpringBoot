package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Document(collection = "Employ_Special_Type")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employ {
    @Id
    private String employId;
    @NonNull
    private Integer employNumber;
    @NonNull
    private String employName;
    @NonNull
    private String employAddress;
    @NonNull
    private Double employSalary;
    @NonNull
    private String[] employFavColors;
    @NonNull
    private List<String> employFriends;
    @NonNull
    private Set<Long> employPhoneNumbers;
    @NonNull
    private Properties employIdDetails;
    @NonNull
    private Map<Integer,String > employInsurancePolicy;
}
