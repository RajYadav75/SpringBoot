package in.raj;

import in.raj.controller.WorkerController;
import in.raj.model.Worker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class BootProj07LayeredApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BootProj07LayeredApplication.class, args);
        WorkerController controller = run.getBean("wrkrController", WorkerController.class);
        try {
            List<Worker> workerList = controller.showWorker(2);
            workerList.forEach(worker -> System.out.println(worker));
        } catch (Exception e) {
            e.printStackTrace();
        }
        run.close();
    }

}
