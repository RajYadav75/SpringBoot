package in.raj.entity.prod;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "JPA_ORACLE_PRODUCT_TAB")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String productName;
    @NonNull
    private Double productPrice;
    @NonNull
    private Double productQuantity;
    @NonNull
    private Boolean productStatus;
    @NonNull
    private LocalDateTime productExpiryDate;
}
