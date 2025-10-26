package in.raj.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Medal")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Medal {
    @Id
    @Field(name = "medalId")
    @NonNull
    private Integer id;
    @NonNull
    @Field(name = "medalName")
    private String name;
    @NonNull
    @Field(name = "medalEvent")
    private String event;
    @NonNull
    @Field(name = "medalPlace")
    private String place;

}
