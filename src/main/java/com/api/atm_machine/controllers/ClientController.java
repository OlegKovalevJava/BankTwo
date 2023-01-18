package com.api.atm_machine.controllers;


import com.api.atm_machine.dto.ClientDto;
import com.api.atm_machine.entity.ClientEntity;
import com.api.atm_machine.mapper.ClientMapper;
import com.api.atm_machine.repository.ClientRepo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientRepo clientRepo;

    public ClientController(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<ClientDto> allClient() {
        return clientRepo.findAll()
                .stream()
                .map(ClientMapper::toDto)
                .toList();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    @ResponseBody
    public ClientDto createClient(@RequestBody ClientDto clientDto) {
        ClientEntity clientEntity = ClientMapper.toEntity(clientDto);
        ClientEntity savedClient = clientRepo.save(clientEntity);
        return ClientMapper.toDto(savedClient);
    }

}