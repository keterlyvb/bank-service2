package br.com.keterly.bankservice2.service;

import br.com.keterly.bankservice2.dto.CustomerDTO;
import br.com.keterly.bankservice2.dto.TransferDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<CustomerDTO> create(CustomerDTO request);

    List<CustomerDTO> getAll();

    Optional<CustomerDTO> getByAccountNumber(int accountNumber);

    void executeTransfer(TransferDTO request);

    List<TransferDTO> getCustomerTransfers(int accountNumber);
}
