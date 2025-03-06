package br.com.keterly.bankservice2.persistence.repository;

import br.com.keterly.bankservice2.persistence.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByAccountNumber(int accountNumber);
}
