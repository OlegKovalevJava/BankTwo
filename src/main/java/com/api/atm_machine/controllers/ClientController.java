package com.api.atm_machine.controllers;


import com.api.atm_machine.entity.Client;
import com.api.atm_machine.repository.ClientRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientRepo clientRepo;

    public ClientController(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }

    @GetMapping
    public List<Client> allClient() {
        return clientRepo.findAll();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepo.save(client);
    }

}