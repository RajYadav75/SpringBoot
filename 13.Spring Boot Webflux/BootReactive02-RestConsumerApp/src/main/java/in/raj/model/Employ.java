package in.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
    private Integer id;
    private String empName;
    private String empDept;
    private Double empSal;
}
