package in.raj.runner;

import in.raj.entity.Employ;
import in.raj.entity.Laptop;
import in.raj.repository.EmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OneToOneMappingRunner implements CommandLineRunner {
    @Autowired
    private EmployRepo employRepo;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== One-To-One: Employ ↔ Laptop Example ===");

        // Laptop object बनाएं
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("Inspiron 5518");
        laptop.setSerialNumber("SN987654");

        // Employ object बनाएं और Laptop assign करें
        Employ emp = new Employ();
        emp.setName("Raj Yadav");
        emp.setSalary(85000.00);
        emp.setLaptop(laptop); // cascade = ALL होने से laptop auto-save होगा

        // Save Employ (Laptop auto-save)
        employRepo.save(emp);
        System.out.println("✅ Employee & Laptop saved successfully!");

        // Fetch data back
        Employ fetched = employRepo.findById(emp.getId()).get();
        System.out.println("\nFetched Employee Details:");
        System.out.println("ID: " + fetched.getId());
        System.out.println("Name: " + fetched.getName());
        System.out.println("Salary: " + fetched.getSalary());

        Laptop fetchedLaptop = fetched.getLaptop();
        System.out.println("\nAssociated Laptop Details:");
        System.out.println("Laptop ID: " + fetchedLaptop.getLaptopId());
        System.out.println("Brand: " + fetchedLaptop.getBrand());
        System.out.println("Model: " + fetchedLaptop.getModel());
        System.out.println("Serial Number: " + fetchedLaptop.getSerialNumber());

        System.out.println("=== Example Complete ===");
    }
}
