package in.raj.runner;

import in.raj.entity.Friends;
import in.raj.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class SaveRunner implements CommandLineRunner {
    @Autowired
    private IFriendService friendService;
    @Override
    public void run(String... args) throws Exception {
        try{
            Friends friend1 = new Friends();
            friend1.setName("John Doe");
            friend1.setSalary(50000.00);
            friend1.setPhno(9876543210L);
            friend1.setEmail("john.doe@example.com");

            Friends friend2 = new Friends();
            friend2.setName("Alice Smith");
            friend2.setSalary(60000.50);
            friend2.setPhno(8765432109L);
            friend2.setEmail("alice.smith@example.com");


            Friends friend3 = new Friends();
            friend3.setName("Robert Johnson");
            friend3.setSalary(45000.75);
            friend3.setPhno(7654321098L);
            friend3.setEmail("robert.j@example.com");


            Friends friend4 = new Friends();
            friend4.setName("Emily Davis");
            friend4.setSalary(72000.00);
            friend4.setPhno(6543210987L);
            friend4.setEmail("emily.d@example.com");


            Friends friend5 = new Friends();
            friend5.setName("Daniel Wilson");
            friend5.setSalary(53000.25);
            friend5.setPhno(5432109876L);
            friend5.setEmail("daniel.w@example.com");

            Friends friend6 = new Friends();
            friend6.setName("Sophia Martinez");
            friend6.setSalary(81000.00);
            friend6.setPhno(4321098765L);
            friend6.setEmail("sophia.m@example.com");


            Friends friend7 = new Friends();
            friend7.setName("William Anderson");
            friend7.setSalary(67000.50);
            friend7.setPhno(3210987654L);
            friend7.setEmail("william.a@example.com");


            Friends friend8 = new Friends();
            friend8.setName("Ava Thomas");
            friend8.setSalary(58000.00);
            friend8.setPhno(2109876543L);
            friend8.setEmail("ava.t@example.com");


            Friends friend9 = new Friends();
            friend9.setName("James Taylor");
            friend9.setSalary(76000.75);
            friend9.setPhno(1098765432L);
            friend9.setEmail("james.t@example.com");


            Friends friend10 = new Friends();
            friend10.setName("Mia Garcia");
            friend10.setSalary(69000.00);
            friend10.setPhno(9988776655L);
            friend10.setEmail("mia.g@example.com");


            Friends friend11 = new Friends();
            friend11.setName("Ethan Brown");
            friend11.setSalary(48000.50);
            friend11.setPhno(8877665544L);
            friend11.setEmail("ethan.b@example.com");


            Friends friend12 = new Friends();
            friend12.setName("Charlotte Clark");
            friend12.setSalary(64000.00);
            friend12.setPhno(7766554433L);
            friend12.setEmail("charlotte.c@example.com");

            String storedFriendsData = friendService.saveFriends(List.of(friend1, friend2, friend3, friend4, friend5, friend6, friend7, friend8, friend9, friend10, friend11, friend12));
            System.out.println(storedFriendsData);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
