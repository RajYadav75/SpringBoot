package in.raj.service;

import in.raj.entity.offers.Offers;
import in.raj.entity.prod.Product;
import in.raj.repository.offers.IOffersRepo;
import in.raj.repository.prod.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMgmtImpl implements IProductMgmt{
    @Autowired
    private IProductRepo productRepo;
    @Autowired
    private IOffersRepo offersRepo;
    @Override
    public String registerProducts(List<Product> products) {
        productRepo.saveAll(products);
        return products.size() + " products registered successfully";
    }

    @Override
    public String registerOffers(List<Offers> offers) {
        offersRepo.saveAll(offers);
        return offers.size() + " offers registered successfully";
    }

    @Override
    public List<Offers> showAllOffers() {
        return offersRepo.findAll();
    }

    @Override
    public List<Product> showAllProducts() {
        return productRepo.findAll();
    }
}
