package in.raj.runner;

import in.raj.entity.MarriageSeeker;
import in.raj.service.IMarriageService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.FileWriter;

@Component
public class LoadingDataLOBRunner implements CommandLineRunner {
    @Autowired
    private IMarriageService marriageService;
    @Override
    public void run(String... args) throws Exception {
        //TODO:- Load object operation
        MarriageSeeker seeker = marriageService.getMarriageSeekarById(1);
        System.out.println(seeker.getId()+seeker.getName()+seeker.getAddress()+seeker.getDateOfBirth()+seeker.getIsIndian());

        byte[] photo = seeker.getPhoto();
        char[] resume = seeker.getResume();

        //TODO:- write the content to destination files
        FileOutputStream fos = new FileOutputStream("dbStoredPhoto.jpeg");
        fos.write(photo);
        fos.flush();
        fos.close();

        FileWriter fw = new FileWriter("dbStoredResume.txt");
        fw.write(resume);
        fw.flush();
        fw.close();
    }
}
