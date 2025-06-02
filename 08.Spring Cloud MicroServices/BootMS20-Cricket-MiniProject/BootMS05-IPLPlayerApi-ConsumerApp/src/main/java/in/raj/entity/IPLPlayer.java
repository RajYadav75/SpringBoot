package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "IPLPlayer")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString
@Getter
@Setter
public class IPLPlayer implements Serializable {
    @Id
    @SequenceGenerator(name = "gen1",sequenceName = "PID_Seq", allocationSize = 1)
    @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    private Integer playerId;
    @NonNull
    @Column(length = 20)
    private String playerName;
    @NonNull
    @Column(length = 2)
    private Integer playerAge;
    @NonNull
    @Column(length = 20)
    private String role;
    @NonNull
    @ManyToOne(targetEntity = IPLTeam.class, fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "tID",referencedColumnName = "teamId")// Foreign Key Column
    private IPLTeam team;
}
