package in.raj.services;

public interface IOneToManyService {
    public void saveDataUsingCustomer();
    public void saveDataUsingPhoneNumber();
    public void getDataUsingCustomer();
    public void getDataUsingPhoneNumber();
    public void deleteDataUsingCustomer(int id);
}
