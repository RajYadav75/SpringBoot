package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Laptop Entity Class
 * ---------------------
 * यह class Database में LAPTOP टेबल को represent करती है।
 * यह Employ entity के साथ One-To-One Relationship रखती है।
 * एक Laptop केवल एक Employee को assign किया जा सकता है।
 */
@Entity
@Table(name = "LAPTOP_ONE_TO_ONE")
@Data
public class Laptop {

    /**
     * Primary Key: Laptop ID (auto-generated)
     * यह sequence Oracle DB के लिए उपयुक्त है।
     * sq2 sequence 500000 से शुरू होकर हर बार 1 से बढ़ेगी।
     */
    @Id
    @SequenceGenerator(
            name = "gen2",                 // Sequence generator का नाम
            sequenceName = "sq2",          // Database sequence का नाम
            allocationSize = 1,            // Increment step size
            initialValue = 500000          // Starting value
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen2")
    private Long laptopId;                 // Laptop का unique ID (Primary Key)

    /** Laptop का Brand नाम (उदा: Dell, HP, Lenovo आदि) */
    private String brand;

    /** Laptop का Model (उदा: Inspiron 15, ThinkPad X1, आदि) */
    private String model;

    /** Laptop का Serial Number (Unique पहचान नंबर) */
    private String serialNumber;

    /**
     * Bidirectional One-To-One Mapping with Employ entity
     * -----------------------------------------------------
     * 1️⃣ यह field inverse side को represent करती है।
     * 2️⃣ "mappedBy" का मतलब — यह side DB में foreign key नहीं रखती,
     *     बल्कि Employ entity foreign key column maintain करती है।
     * 3️⃣ mappedBy का नाम हमेशा Employ class में declared variable से मैच करना चाहिए।
     *     यानि: Employ class में variable का नाम "laptop" है,
     *     तो यहाँ mappedBy = "laptop" होना चाहिए।
     */
    @OneToOne(mappedBy = "laptop")  // corrected name (was "Laptop")
    private Employ employ;           // Linked Employee (optional)
}
