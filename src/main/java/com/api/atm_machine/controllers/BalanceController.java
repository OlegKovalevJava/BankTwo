package com.api.atm_machine.controllers;

import com.api.atm_machine.repository.ClientRepo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("balance")
public class BalanceController {

    private final ClientRepo clientRepo;

    public BalanceController(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public BigDecimal getBalance(@PathVariable Long id) {
        BigDecimal balance = clientRepo.findById(id).get().getBalance();
        return balance;
    }
}
