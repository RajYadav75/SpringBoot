package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/* TODO:-
        | Annotation                 | Constructor Type                | कौन-सी Fields शामिल होती हैं |
        | -------------------------- | ------------------------------- | ---------------------------- |
        | `@NoArgsConstructor`       | बिना argument वाला                | कोई नहीं                     |
        | `@RequiredArgsConstructor` | ज़रूरी (NonNull / final) fields  | सिर्फ `@NonNull` और `final`  |
        | `@AllArgsConstructor`      | सभी fields वाला                 | class की सारी fields         |
*/

@Data
@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    private LocalDateTime dateOfBirth;
    @NonNull
    @Lob
    private byte[] photo;
    @NonNull
    @Lob
    private char[] resume;
    @NonNull
    private Boolean isIndian;
}
