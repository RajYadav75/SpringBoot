package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;
import java.util.Set;

@Document(collection = "Player")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = {"sportsInfo", "medalsInfo"})
public class Player {
    @Id
    @Field(name = "playerId")
    @NonNull
    private Integer pId;
    @NonNull
    @Field(name = "playerName")
    private String pName;
    @Field(name = "playerAddress")
    @NonNull
    private String pAddress;
    @NonNull
    @Field(name = "playerAge")
    private int pAge;
    @NonNull
    private Set<Sport> sportsInfo;
    @NonNull
    private Map<String,Medal> medalsInfo;
}
