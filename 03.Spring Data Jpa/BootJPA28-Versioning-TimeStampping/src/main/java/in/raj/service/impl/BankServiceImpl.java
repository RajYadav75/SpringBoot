package in.raj.service.impl;

import in.raj.entity.BankAccount;
import in.raj.repo.IBank;
import in.raj.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements IBankService {
    @Autowired
    private IBank bankRepo;
    @Override
    public String registerUser(BankAccount bankAccount) {
        Long accountNumber = bankRepo.save(bankAccount).getAccountNumber();
        return "User added with account number " + accountNumber;
    }

    @Override
    public List<BankAccount> getAllBankAccounts() {
        return bankRepo.findAll();
    }

    @Override
    public BankAccount getBankAccountById(Long id) {
        return bankRepo.getReferenceById(id);
    }

    @Override
    public String updateMobileNumber(Long id, Long mobileNumber) {
        Optional<BankAccount> gettingUserById = bankRepo.findById(id);
        if (gettingUserById.isPresent()) {
            BankAccount bankAccount = gettingUserById.get();
            bankAccount.setMobileNumber(mobileNumber);
            bankRepo.save(bankAccount);
            return id+" User updated with account number " + mobileNumber;
        }else {
            return "User with account number " + id + " not found";
        }
    }
}
