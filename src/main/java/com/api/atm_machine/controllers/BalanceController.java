package com.api.atm_machine.controllers;

import com.api.atm_machine.mapper.ClientMapper;
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
    public BigDecimal getClient(@PathVariable Long id) {
        return ClientMapper.toDtoBalance(clientRepo.findById(id).get());
    }

}