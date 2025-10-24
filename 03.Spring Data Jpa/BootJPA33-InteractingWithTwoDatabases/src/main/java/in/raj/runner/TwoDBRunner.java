package in.raj.runner;

import in.raj.entity.offers.Offers;
import in.raj.entity.prod.Product;
import in.raj.service.IProductMgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class TwoDBRunner implements CommandLineRunner {
    @Autowired
    private IProductMgmt service;
    @Override
    public void run(String... args) throws Exception {
        //TODO:- Save Product
        List<Product> productList = List.of(new Product("table",4800.00,10.00,true, LocalDateTime.of(2090, 10,20,12,11,33)),
                new Product("chair", 9000.0, 10.0, true, LocalDateTime.of(2090, 10,20,12,11,33)));
        service.registerProducts(productList);
        System.out.println("---------------------------------------------------------------------------");
        //TODO:- Save Offers
        List<Offers> offersList = List.of(new Offers("MonsoonOffer", 40.0f,LocalDateTime.now(),LocalDateTime.of(2025, 10,20,12,11,33)),
                new Offers("GreatIndianSale", 40.0f,LocalDateTime.now(),LocalDateTime.of(2025, 9,20,12,11,33)));
        service.registerOffers(offersList);
        System.out.println("**********************************************************************************");
        System.out.println("========================================================================================");
        service.showAllProducts().forEach(System.out::println);
        System.out.println("========================================================================================");
        service.showAllOffers().forEach(System.out::println);
        System.out.println("========================================================================================");
    }
}
