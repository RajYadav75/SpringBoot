package in.raj.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "JPA_HEROINES_TAB")
@Data
public class Heroines {
    @Id
    @SequenceGenerator(name = "gen1", sequenceName = "OneIn", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
    private Integer id;
    private String name;
    private Double fees;
    private String description;

    private LocalDateTime ldt;
    private LocalDate ld;
    private LocalTime lt;
}