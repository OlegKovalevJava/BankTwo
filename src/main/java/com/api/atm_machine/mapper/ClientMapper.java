package com.api.atm_machine.mapper;

import com.api.atm_machine.dto.ClientDto;
import com.api.atm_machine.entity.ClientEntity;

public class ClientMapper {

    public static ClientDto toDto(ClientEntity clientEntity) {
        return ClientDto.builder()
                .id(clientEntity.getId())
                .balance(clientEntity.getBalance())
                .build();
    }

    public static ClientEntity toEntity(ClientDto clientDto) {
        return ClientEntity.builder()
                .id(clientDto.getId())
                .balance(clientDto.getBalance())
                .build();
    }
}