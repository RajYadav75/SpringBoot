package in.raj.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "IPLTeams")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class IPLTeam implements Serializable {
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
