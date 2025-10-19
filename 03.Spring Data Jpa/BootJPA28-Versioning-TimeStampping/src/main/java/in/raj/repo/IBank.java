package in.raj.repo;

import in.raj.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBank extends JpaRepository<BankAccount,Long> {
}
