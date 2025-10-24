package in.raj.service;

import in.raj.entity.offers.Offers;
import in.raj.entity.prod.Product;

import java.util.List;

public interface IProductMgmt {
    public String registerProducts(List<Product> products);
    public String registerOffers(List<Offers> offers);
    public List<Offers> showAllOffers();
    public List<Product> showAllProducts();
}
