package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "IPLTeams")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class IPLTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teamID;

    @NonNull
    @Column(length = 20)
    private String teamName;

    @NonNull
    @Column(length = 20)
    private String owner;

    @NonNull
    @Column(length = 20)
    private String area;

}
