package in.raj.runner;

import in.raj.entity.MarriageSeeker;
import in.raj.service.IMarriageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Scanner;

//@Component
public class SaveDataLOBRunners implements CommandLineRunner {
    @Autowired
    private IMarriageService marriageService;
    @Override
    public void run(String... args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name::");
        String name=sc.nextLine();

        System.out.println("enter address::");
        String addrs=sc.nextLine();


        System.out.println("enter DOB (yyyy-MM-ddThh:mm:ss)::");
        String dob=sc.nextLine();
        LocalDateTime ldob=LocalDateTime.parse(dob);

        System.out.println(" Is Customer Indian?");
        boolean indian=sc.nextBoolean();
        sc.nextLine();

        System.out.println("enter photo file path::");
        String photoPath=sc.nextLine();

        System.out.println("enter resume file path::");
        String resumePath=sc.nextLine();

        //TODO:- create streams representing  photo file ,resume file
        //TODO:- create byte[] and char[] having data
        FileInputStream fis=new FileInputStream(photoPath);
        byte[] photoContent=fis.readAllBytes();

        File file=new File(resumePath);
        FileReader reader=new FileReader(resumePath);
        char[] resumeContent=new char[(int) file.length()];
        reader.read(resumeContent);

        //create Model/Entity class object
        MarriageSeeker seeker=
                new MarriageSeeker(name, addrs, ldob, photoContent, resumeContent, indian);

        // save the object
        try {
            System.out.println(marriageService.registerMarriageSeekers(seeker));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
