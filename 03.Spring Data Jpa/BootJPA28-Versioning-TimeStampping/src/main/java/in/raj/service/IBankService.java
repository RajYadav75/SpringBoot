package in.raj.service;

import in.raj.entity.BankAccount;

import java.util.List;

public interface IBankService {
    public String registerUser(BankAccount bankAccount);
    public List<BankAccount> getAllBankAccounts();
    public BankAccount getBankAccountById(Long id);
    public String updateMobileNumber(Long id,Long mobileNumber);
}
