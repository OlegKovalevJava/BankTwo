package com.api.atm_machine.service;

import com.api.atm_machine.repository.ClientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepo clientRepo;

    public BigDecimal getBalance(Long id) {
        return clientRepo.findById(id).get().getBalance();
    }

}