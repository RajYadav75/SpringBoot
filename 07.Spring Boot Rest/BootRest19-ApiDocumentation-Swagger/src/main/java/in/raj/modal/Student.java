package in.raj.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @SequenceGenerator(name = "Gen1" , allocationSize = 1 , initialValue = 1000)
    @GeneratedValue(generator = "Gen1", strategy = GenerationType.SEQUENCE)
    @Id
    private  Integer  id;
    @Column
    @NonNull
    private  String  name;

    @Column
    @NonNull
    private  String  addrs;

    @Column
    @NonNull
    private  String packageType;
    @NonNull
    private  Double  budget;
    @NonNull
    private LocalDateTime startDate;
    @NonNull
    private  LocalDateTime endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NonNull String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public @NonNull String getAddrs() {
        return addrs;
    }

    public void setAddrs(@NonNull String addrs) {
        this.addrs = addrs;
    }

    public @NonNull String getPackageType() {
        return packageType;
    }

    public void setPackageType(@NonNull String packageType) {
        this.packageType = packageType;
    }

    public @NonNull Double getBudget() {
        return budget;
    }

    public void setBudget(@NonNull Double budget) {
        this.budget = budget;
    }

    public @NonNull LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(@NonNull LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public @NonNull LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(@NonNull LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
