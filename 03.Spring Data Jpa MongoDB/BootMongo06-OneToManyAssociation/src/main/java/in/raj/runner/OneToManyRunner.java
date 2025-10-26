package in.raj.runner;

import in.raj.document.Medal;
import in.raj.document.Player;
import in.raj.document.Sport;
import in.raj.service.ISportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;
import java.util.Set;

@Component
public class OneToManyRunner implements CommandLineRunner {
    @Autowired
    private ISportService sportService;
    @Override
    public void run(String... args) throws Exception {
        try {
            //TODO:- Child class1 Objects
            Sport sport1 = new Sport(new Random().nextInt(1000),"Badminton", new String[]{"Racket", "Shuttlecock", "Net", "Court Shoes"});
            Sport sport2 = new Sport(new Random().nextInt(1000),"Cricket", new String[]{"Bat", "Ball", "Wickets", "Helmet", "Gloves", "Pads"});
            Sport sport3 = new Sport(new Random().nextInt(1000),"Football", new String[]{"Football", "Jersey", "Shin Guards", "Cleats"});
            //TODO:- Child Class2 Objects
            Medal medal1 = new Medal(new Random().nextInt(1000),"Olympic Gold Medal", "100m Sprint", "1st Place");
            Medal medal2 = new Medal(new Random().nextInt(1000),"Olympic Silver Medal", "Long Jump", "2nd Place");
            Medal medal3 = new Medal(new Random().nextInt(1000),"Olympic Bronze Medal", "High Jump", "3rd Place");
            //TODO:- Parent Class Object
            Player player = new Player(new Random().nextInt(1000),"Raj Yadav", "GKP, India", 25,
                    Set.of(sport1, sport2, sport3),
                    Map.of("Medal1", medal1,
                            "Medal2", medal2,
                            "Medal3", medal3));
            System.out.println(sportService.registerPlayerWithSportAndMedals(player));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("=================FindAll Operation=================");
        sportService.fetchAllPlayersInfo().forEach(per->{
            System.out.println("Parent :: "+per);
            // TODO:- Access Child Class1 Data
            Set<Sport> sportsInfo = per.getSportsInfo();
            sportsInfo.forEach(sport->{
                System.out.println("\tChild1 :: "+sport);
            });
            //TODO:- Access Child Class2 Data
            Map<String, Medal> medalsInfo = per.getMedalsInfo();
            medalsInfo.forEach((type,medal)->{
                System.out.println("\tChild2 :: "+type+" Details :: "+medal);
            });
        });
    }
}
