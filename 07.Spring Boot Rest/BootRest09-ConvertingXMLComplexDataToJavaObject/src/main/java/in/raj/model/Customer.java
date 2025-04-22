package in.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Integer cno;
    private  String cname;
    private  String cadd;
    private  List<Company> compniesList;
    private List<Map<String,Object>> familyIds;
}
