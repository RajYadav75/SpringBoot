package in.raj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Employ Entity Class
 * ---------------------
 * यह Entity EMPLOY_ONE_TO_ONE टेबल को represent करती है।
 * यह Laptop entity के साथ One-To-One relationship रखती है।
 */
@Entity
@Table(name = "EMPLOY_ONE_TO_ONE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employ implements Serializable {

    /**
     * Primary Key: Employee ID (auto-generated)
     * SEQUENCE strategy Oracle DB के लिए उपयुक्त है।
     * यह sq नाम की sequence का उपयोग करेगा जो 100000 से शुरू होगी।
     */
    @Id
    @SequenceGenerator(
            name = "gen1",                   // Generator का नाम
            sequenceName = "sq",             // Oracle sequence का नाम
            allocationSize = 1,              // हर बार 1 से increment
            initialValue = 100000            // शुरुआती value
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
    private Long id;                         // Employee ID (Primary Key)

    /**
     * Employee का नाम
     */
    private String name;

    /**
     * Employee की salary
     */
    private Double salary;

    /**
     * One-to-One Mapping with Laptop entity
     * ---------------------------------------
     * 1️⃣  एक Employee का केवल एक Laptop होगा।
     * 2️⃣  CascadeType.ALL का मतलब — Employee पर की गई सभी CRUD operations Laptop पर भी लागू होंगी।
     * जैसे: save(), delete(), update() आदि।
     * 3️⃣  @JoinColumn के द्वारा Employee टेबल में एक foreign key column बनेगा जिसका नाम laptop_Id होगा।
     * 4️⃣  referencedColumnName = "laptopId" बताता है कि यह column Laptop entity के laptopId field को reference करेगा।
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_Id", referencedColumnName = "laptopId")
    private Laptop laptop; // Associated Laptop object
}

