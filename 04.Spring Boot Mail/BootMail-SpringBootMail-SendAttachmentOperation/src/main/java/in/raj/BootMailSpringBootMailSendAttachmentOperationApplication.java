package in.raj;

import in.raj.service.IPurchaseOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootMailSpringBootMailSendAttachmentOperationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootMailSpringBootMailSendAttachmentOperationApplication.class, args);
        //TODO:- Get Service Class Object References
        IPurchaseOrder purchaseOrderBean = applicationContext.getBean(IPurchaseOrder.class);
        //TODO:- Invoke the b.method
        try {
            String shopping = purchaseOrderBean.shopping(new String[]{"Laptop", "HeadPhone", "Mouse"}, new double[]{45000.0, 5000.0, 1500.0},
                    new String[]{"badalsingh745745@gmail.com", "rajyadav2052000@gmail.com"});
            System.out.println(shopping);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}