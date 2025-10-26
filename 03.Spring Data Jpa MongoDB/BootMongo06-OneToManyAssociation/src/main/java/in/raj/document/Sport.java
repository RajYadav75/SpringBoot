package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Sport")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Sport {
    @Id
    @Field(name = "sportId")
    @NonNull
    private Integer id;
    @NonNull
    @Field(name = "sportName")
    private String name;
    @NonNull
    @Field(name = "sportKitItems")
    private String[] kitItems;
}
