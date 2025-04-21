package in.raj.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dost {
    private  Integer no;
    private  String  name;
    private  String add;
    private  Float billAmount;
    private LocalDateTime ldt;
}
