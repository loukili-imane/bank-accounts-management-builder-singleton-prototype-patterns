package ma.imane.repository;

import ma.imane.entity.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findByID(Long id);
   List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
   BankAccount update(BankAccount account);
   void deleteById(Long id);
}
