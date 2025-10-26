package in.raj.service.impl;

import in.raj.service.IPurchaseOrder;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

@Service
public class PurchaseOrder implements IPurchaseOrder {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String fromEmail;
    @Override
    public String shopping(String[] items, double[] prices, String[] emails) throws Exception {
        double billAmount = 0.0;
        for (double price : prices) {
            billAmount += price;
        }
        String msg = Arrays.toString(items) + " items are purchased having prices" + Arrays.toString(prices) + " with total bill amount:" + billAmount;
        //TODO:- Send Mails
        String  status = sendMail(fromEmail,emails,msg);
        return msg+"............"+status;
    }

    private String sendMail(String fromEmail, String[] emails, String msg) throws Exception {
        //Logic to send mail
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(fromEmail);
        helper.setTo(emails);
        helper.setSubject("Purchase Order Details Open It to know it");
        helper.setSentDate(new Date());
        helper.setText(msg);
        helper.addAttachment("Angular 16.pptx",new ClassPathResource("Angular 16.pptx"));
        //Send Mail
        mailSender.send(mimeMessage);
        return "Mail Sent Successfully";
    }
}
