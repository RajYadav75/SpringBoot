package in.raj.entity.offers;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "JPA_MYSQL_OFFERS_TAB")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Offers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer offerId;
    @NonNull
    private String offerName;
    @NonNull
    private Float discountPercentage;
    @NonNull
    private LocalDateTime startFrom;
    @NonNull
    private LocalDateTime endOn;
}
