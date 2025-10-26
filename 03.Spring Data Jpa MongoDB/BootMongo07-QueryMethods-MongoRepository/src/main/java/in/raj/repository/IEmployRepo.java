package in.raj.repository;

import in.raj.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IEmployRepo extends MongoRepository<Employee, Integer> {
    @Query(fields = "{employId:0, employNumber:1, employName:1, employSalary:1}", value = "{employAddress:?0}")
    public List<Object[]> getEmpDataByAddress(String address);

    @Query(fields = "{}", value = "{employAddress:?0}")
    public List<Employee> getEmpFullDataByAddress(String address);

    @Query(value = "{employName: ?0, employAddress: ?1}")
    public List<Employee> getEmpFullDataByNameAndAddress(String name, String address);

    @Query(value = "{$or: [{employName: ?0}, {employAddress: ?1}]}")
    public List<Employee> getEmpFullDataByNameOrAddress(String name, String address);

    @Query(fields = "{employNumber:1,employName:1, employAddress:1, employSalary:1}", value = "{employSalary: {$gte: ?0},employSalary:{ $lte: ?1}}")
    public List<Object[]> getEmpDataBySalary(Double startSalary, Double endSalary);

    @Query(value = "{employName: {'$regex' : ?0, '$options': 'i'}}")
    public List<Employee> getEmpFullDataByEmployNameCharacter(String character);

    @Query(value = "{employAddress: {$in: [?0, ?1, ?2]}}")
    public List<Employee> getEmployeeFullDataByEmployAddress(String address1, String address2, String address3);

    @Query(value = "{employSalary: {$gte: ?0, $lte: ?1}}", count = true)
    public int getEmpCountBySalaryRange(Double startSalary, Double endSalary);

    @Query(value = "{}", sort = "{employName: 1}")
    public List<Employee> getEmployByNameSorting();

    @Query(value = "{employAddress: null}", delete = true)
    public int deleteEmpWithNoAddress();

    @Query(value = "{employSalary: {$gte: ?0, $lte: ?1}}", exists = true)
    public boolean isEmpFoundBySalaryRange(Double startSalary, Double endSalary);
}
