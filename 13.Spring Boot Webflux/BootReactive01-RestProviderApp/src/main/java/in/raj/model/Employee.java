package in.raj.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Reactive-Employee")
public class Employee {
    @Id
    private Integer id;
    private String empName;
    private String empDept;
    private Double empSalary;
}
