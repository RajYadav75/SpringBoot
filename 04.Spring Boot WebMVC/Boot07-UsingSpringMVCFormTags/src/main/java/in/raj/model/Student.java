package in.raj.model;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String address;
    private Double average;
}
