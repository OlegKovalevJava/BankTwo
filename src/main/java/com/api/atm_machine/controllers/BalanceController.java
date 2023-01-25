package com.api.atm_machine.controllers;

import com.api.atm_machine.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("balance")
@AllArgsConstructor
public class BalanceController {


    private final ClientService clientService;

    @GetMapping("{id}")
    public BigDecimal getBalance(@PathVariable Long id) {
        return clientService.getBalance(id);
    }

}