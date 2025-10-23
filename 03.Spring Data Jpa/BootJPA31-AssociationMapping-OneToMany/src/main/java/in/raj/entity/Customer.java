package in.raj.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@ToString(exclude = "phones") // 🚨 prevent recursion
@EqualsAndHashCode(exclude = "phones")
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer cid;
    @Nonnull
    @Column(length = 20)
    private  String  cname;
    @Nonnull
    @Column(length = 20)
    private  String  caddrs;
    @OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,mappedBy = "customer",
            fetch = FetchType.EAGER)
    private Set<PhoneNumber> phones;
}
