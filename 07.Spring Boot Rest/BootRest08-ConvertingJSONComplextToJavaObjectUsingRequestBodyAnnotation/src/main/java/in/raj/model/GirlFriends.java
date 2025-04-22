package in.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GirlFriends {
    private String firstName;
    private String lastName;
    private  String address;
    private  Float salary;
    //array
    private  String[] nickNames;
    //collections
    private List<String> friends;
    private Set<Long> phoneNumbers;
    private Map<String,Integer> idDetails;
    //HAS-A property
    private  Company  company;
    //date  type
    private LocalDateTime dob;
    // boolean type
    private   Boolean isIndian;
    
}
