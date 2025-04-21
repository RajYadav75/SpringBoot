package in.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Friends {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Long phone;
    /*
    <Person>
        <id>123</id>
        <name>John Doe</name>
        <age>30</age>
        <address>123 Main Street, Cityville</address>
        <phone>9876543210</phone>
    </Person>
    */
}
