package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "JPA_CUSTOMER_TAB")
@Data
public class Customer {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "customerId_Seq",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer id;
    private String name;
    private String address;
    private Double billAmt;
}
