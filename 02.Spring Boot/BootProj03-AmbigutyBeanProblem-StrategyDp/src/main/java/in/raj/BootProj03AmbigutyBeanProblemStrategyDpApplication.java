package in.raj;

import in.raj.sbeans.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj03AmbigutyBeanProblemStrategyDpApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext applicationContext =
					SpringApplication.run(BootProj03AmbigutyBeanProblemStrategyDpApplication.class, args);){
			Vehicle vehicle = applicationContext.getBean(Vehicle.class);
			vehicle.move("Gorakhpur","Surat");


		}catch (Exception e){
			System.out.println(e);
		}
	}

}
