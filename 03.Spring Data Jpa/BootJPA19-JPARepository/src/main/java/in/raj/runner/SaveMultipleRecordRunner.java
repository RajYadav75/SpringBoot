package in.raj.runner;

import in.raj.entity.Heroines;
import in.raj.repository.IHeroines;
import in.raj.service.IHeroinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SaveMultipleRecordRunner implements CommandLineRunner {
    @Autowired
    private IHeroinesService service;
    @Autowired
    private IHeroines heroines;
    @Override
    public void run(String... args) throws Exception {
        Heroines heroines2 = new Heroines();
        heroines2.setName("Alia Bhatt");
        heroines2.setFees(420000.00);
        heroines2.setDescription("She is a versatile actress known for emotional roles in Bollywood");

        Heroines heroines3 = new Heroines();
        heroines3.setName("Priyanka Chopra");
        heroines3.setFees(500000.00);
        heroines3.setDescription("She is an international star and Bollywood icon");

        Heroines heroines4 = new Heroines();
        heroines4.setName("Katrina Kaif");
        heroines4.setFees(460000.00);
        heroines4.setDescription("She is famous for her dance numbers and glamour in BollyBoot");

        Heroines heroines5 = new Heroines();
        heroines5.setName("Kareena Kapoor Khan");
        heroines5.setFees(480000.00);
        heroines5.setDescription("She is a top actress and known for her iconic characters");

        Heroines heroines6 = new Heroines();
        heroines6.setName("Anushka Sharma");
        heroines6.setFees(440000.00);
        heroines6.setDescription("She is known for her natural and charming acting style");

        Heroines heroines7 = new Heroines();
        heroines7.setName("Shraddha Kapoor");
        heroines7.setFees(390000.00);
        heroines7.setDescription("She is both an actress and singer in BollyBoot");

        Heroines heroines8 = new Heroines();
        heroines8.setName("Jacqueline Fernandez");
        heroines8.setFees(380000.00);
        heroines8.setDescription("She is a Sri Lankan actress active in BollyBoot");

        Heroines heroines9 = new Heroines();
        heroines9.setName("Kriti Sanon");
        heroines9.setFees(400000.00);
        heroines9.setDescription("She is a talented young actress with blockbuster films");

        Heroines heroines10 = new Heroines();
        heroines10.setName("Sara Ali Khan");
        heroines10.setFees(360000.00);
        heroines10.setDescription("She is known for her energetic personality in BollyBoot");

        Heroines heroines11 = new Heroines();
        heroines11.setName("Janhvi Kapoor");
        heroines11.setFees(350000.00);
        heroines11.setDescription("She is the daughter of Sridevi and a rising BollyBoot star");

        Heroines heroines12 = new Heroines();
        heroines12.setName("Kiara Advani");
        heroines12.setFees(370000.00);
        heroines12.setDescription("She gained fame from the movie Kabir Singh in BollyBoot");

        Heroines heroines13 = new Heroines();
        heroines13.setName("Disha Patani");
        heroines13.setFees(365000.00);
        heroines13.setDescription("She is known for fitness and dance performances");

        Heroines heroines14 = new Heroines();
        heroines14.setName("Taapsee Pannu");
        heroines14.setFees(355000.00);
        heroines14.setDescription("She is known for women-centric movies in BollyBoot");

        Heroines heroines15 = new Heroines();
        heroines15.setName("Yami Gautam");
        heroines15.setFees(340000.00);
        heroines15.setDescription("She is known for her simplicity and powerful acting");

        Heroines heroines16 = new Heroines();
        heroines16.setName("Bhumi Pednekar");
        heroines16.setFees(330000.00);
        heroines16.setDescription("She is famous for realistic and strong performances");

        Heroines heroines17 = new Heroines();
        heroines17.setName("Nushrratt Bharuccha");
        heroines17.setFees(310000.00);
        heroines17.setDescription("She is known for her comedy films in BollyBoot");

        Heroines heroines18 = new Heroines();
        heroines18.setName("Rakul Preet Singh");
        heroines18.setFees(300000.00);
        heroines18.setDescription("She works in both South and BollyBoot films");

        Heroines heroines19 = new Heroines();
        heroines19.setName("Parineeti Chopra");
        heroines19.setFees(320000.00);
        heroines19.setDescription("She is a talented actress and singer in BollyBoot");

        Heroines heroines20 = new Heroines();
        heroines20.setName("Sonakshi Sinha");
        heroines20.setFees(340000.00);
        heroines20.setDescription("She is known for action and comedy movies in BollyBoot");

        Heroines heroines21 = new Heroines();
        heroines21.setName("Nora Fatehi");
        heroines21.setFees(350000.00);
        heroines21.setDescription("She is a famous dancer and actress in BollyBoot");

        Heroines heroines22 = new Heroines();
        heroines22.setName("Huma Qureshi");
        heroines22.setFees(330000.00);
        heroines22.setDescription("She is a bold and powerful actress in BollyBoot");

        Heroines heroines23 = new Heroines();
        heroines23.setName("Radhika Apte");
        heroines23.setFees(345000.00);
        heroines23.setDescription("She is known for her intense roles in BollyBoot and OTT");

        Heroines heroines24 = new Heroines();
        heroines24.setName("Kangana Ranaut");
        heroines24.setFees(500000.00);
        heroines24.setDescription("She is a national award-winning actress in BollyBoot");

        Heroines heroines25 = new Heroines();
        heroines25.setName("Vidya Balan");
        heroines25.setFees(470000.00);
        heroines25.setDescription("She is known for her strong female roles in BollyBoot");

        Heroines heroines26 = new Heroines();
        heroines26.setName("Aditi Rao Hydari");
        heroines26.setFees(320000.00);
        heroines26.setDescription("She is an elegant and charming actress in BollyBoot");

        Heroines heroines27 = new Heroines();
        heroines27.setName("Ileana D'Cruz");
        heroines27.setFees(300000.00);
        heroines27.setDescription("She has worked in both South and BollyBoot films");

        Heroines heroines28 = new Heroines();
        heroines28.setName("Tamannaah Bhatia");
        heroines28.setFees(310000.00);
        heroines28.setDescription("She is a pan-India actress known for Baahubali and BollyBoot films");

        Heroines heroines29 = new Heroines();
        heroines29.setName("Sanya Malhotra");
        heroines29.setFees(305000.00);
        heroines29.setDescription("She is known for realistic acting in BollyBoot films");

        Heroines heroines30 = new Heroines();
        heroines30.setName("Fatima Sana Shaikh");
        heroines30.setFees(295000.00);
        heroines30.setDescription("She became popular after Dangal in BollyBoot");

        Heroines heroines31 = new Heroines();
        heroines31.setName("Mrunal Thakur");
        heroines31.setFees(315000.00);
        heroines31.setDescription("She is known for graceful acting in BollyBoot films");

        Heroines heroines32 = new Heroines();
        heroines32.setName("Rashi Khanna");
        heroines32.setFees(290000.00);
        heroines32.setDescription("She is a rising actress in South and BollyBoot cinema");

        Heroines heroines33 = new Heroines();
        heroines33.setName("Shruti Haasan");
        heroines33.setFees(325000.00);
        heroines33.setDescription("She is a talented actress and singer in BollyBoot");

        Heroines heroines34 = new Heroines();
        heroines34.setName("Samantha Ruth Prabhu");
        heroines34.setFees(480000.00);
        heroines34.setDescription("She is a pan-India actress now active in BollyBoot");

        Heroines heroines35 = new Heroines();
        heroines35.setName("Pooja Hegde");
        heroines35.setFees(370000.00);
        heroines35.setDescription("She is a charming actress in South and BollyBoot");

        Heroines heroines36 = new Heroines();
        heroines36.setName("Tara Sutaria");
        heroines36.setFees(285000.00);
        heroines36.setDescription("She is a young actress and singer in BollyBoot");

        Heroines heroines37 = new Heroines();
        heroines37.setName("Kajal Aggarwal");
        heroines37.setFees(350000.00);
        heroines37.setDescription("She is a South superstar also seen in BollyBoot");

        Heroines heroines38 = new Heroines();
        heroines38.setName("Sunny Leone");
        heroines38.setFees(400000.00);
        heroines38.setDescription("She is an actress, model, and entrepreneur in BollyBoot");

        Heroines heroines39 = new Heroines();
        heroines39.setName("Nidhhi Agerwal");
        heroines39.setFees(280000.00);
        heroines39.setDescription("She is a new generation actress in BollyBoot films");

        Heroines heroines40 = new Heroines();
        heroines40.setName("Manushi Chhillar");
        heroines40.setFees(295000.00);
        heroines40.setDescription("She is a former Miss World turned BollyBoot actress");

        // ✅ Save all heroines
        heroines.saveAll(Arrays.asList(
                heroines2, heroines3, heroines4, heroines5, heroines6, heroines7, heroines8,
                heroines9, heroines10, heroines11, heroines12, heroines13, heroines14, heroines15,
                heroines16, heroines17, heroines18, heroines19, heroines20, heroines21, heroines22,
                heroines23, heroines24, heroines25, heroines26, heroines27, heroines28, heroines29,
                heroines30, heroines31, heroines32, heroines33, heroines34, heroines35, heroines36,
                heroines37, heroines38, heroines39, heroines40
        ));

        System.out.println("✅ 40 Bollywood heroines inserted successfully into the database!");
    }
}
