package in.raj.runner;


import in.raj.repository.IEmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class EmpRunner implements CommandLineRunner {
    @Autowired
    private IEmployRepo employRepo;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===================Employ Data Retrieve By Address===================");
        List<Object[]> empDataByAddress = employRepo.getEmpDataByAddress("Harigana");
        empDataByAddress.forEach(row->{
            for (Object field:row){
                System.out.println(field+" ");
                System.out.println("=================Employ Field=================");
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        });
        System.out.println("===================Employ Data Retrieved By Address===================");

        System.out.println("========================Employ Full Data Retrieving=========================");
        employRepo.getEmpFullDataByAddress("Kanapar").forEach(System.out::println);
        System.out.println("===================Employ Data Retrieved By Address===================");

        System.out.println("========================Employ Full Data Retrieving By Name And Address=========================");
        employRepo.getEmpFullDataByNameAndAddress("Baba Yaga","Continental").forEach(System.out::println);
        System.out.println("===================Employ Full Data Retrieved By Name And Address===================");

        System.out.println("========================Employ Full Data Retrieving By Name Or Address=========================");
        employRepo.getEmpFullDataByNameOrAddress("Ankita Tiwari","Harigana").forEach(System.out::println);
        System.out.println("===================Employ Full Data Retrieved By Name Or Address===================");

        System.out.println("===================Employ Data Retrieve By Salary Range===================");
        List<Object[]> empDataBySalary = employRepo.getEmpDataBySalary(40000.0, 90000.0);
        empDataBySalary.forEach(row->{
            for (Object field:row) {
                System.out.println(field + " ");
                System.out.println("=================Employ Field=================");
                System.out.println(Arrays.toString(row));
            }});
        System.out.println("===================Employ Data Retrieved By Salary Range===================");

        System.out.println("========================Employ Full Data Retrieving By Employ Name Character=========================");
        employRepo.getEmpFullDataByEmployNameCharacter("a").forEach(System.out::println);
        employRepo.getEmpFullDataByEmployNameCharacter("^r").forEach(System.out::println);
        employRepo.getEmpFullDataByEmployNameCharacter("b$").forEach(System.out::println);
        System.out.println("===================Employ Full Data Retrieved By  Employ Name Character===================");

        System.out.println("========================Employ Full Data Retrieving By Employ Address=========================");
        employRepo.getEmployeeFullDataByEmployAddress("Kanapar","Harigana","Continental").forEach(System.out::println);
        System.out.println("===================Employ Full Data Retrieved By  Employ Address===================");

        System.out.println("===================Employ Count Retrieve By Salary Range===================");
        int empCountBySalaryRange = employRepo.getEmpCountBySalaryRange(30000.0, 80000.0);
        System.out.println("Employee Count Between Salary Range 30000.0 to 80000.0 : "+empCountBySalaryRange);
        System.out.println("===================Employ Count Retrieved By Salary Range===================");

        System.out.println("===================Employ Data Retrieve By Name Sorting===================");
        employRepo.getEmployByNameSorting().forEach(System.out::println);
        System.out.println("===================Employ Data Retrieved By Name Sorting===================");

        System.out.println("===================Employ Data Deletion With No Address===================");
        int deleteEmpWithNoAddress = employRepo.deleteEmpWithNoAddress();
        System.out.println("Number of Employees Deleted With No Address : "+deleteEmpWithNoAddress);
        System.out.println("===================Employ Data Deleted With No Address===================");

        System.out.println("===================Employ Data Existence Check By Salary Range===================");
        boolean isEmpFoundBySalaryRange = employRepo.isEmpFoundBySalaryRange(50000.0, 100000.0);
        System.out.println("Is Employee Found Between Salary Range 50000.0 to 100000.0 : "+isEmpFoundBySalaryRange);
        System.out.println("===================Employ Data Existence Checked By Salary Range===================");
    }
}
