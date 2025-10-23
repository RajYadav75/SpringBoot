package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Table
@Getter
@Setter
@ToString(exclude = "customer") // 🚨 prevent recursion
@EqualsAndHashCode(exclude = "customer")
@NoArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber implements Serializable {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "sq1",allocationSize=1,initialValue=1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer regNumber;

    @Column(nullable = false,unique = true)
    @NonNull
    private  Long  phoneNumber;
    @Column(length = 20)
    @NonNull
    private  String  numberType;
    @Column(length = 20)
    @NonNull
    private   String  provider;

    @ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "CUSOTMER_ID",referencedColumnName = "CID")
    private  Customer  customer;

}
