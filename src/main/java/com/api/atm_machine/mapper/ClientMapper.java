package com.api.atm_machine.mapper;

import com.api.atm_machine.dto.ClientDto;
import com.api.atm_machine.entity.ClientEntity;

import java.math.BigDecimal;

public class ClientMapper {

    public static ClientDto toDto(ClientEntity clientEntity) {
        return ClientDto.builder()
                .id(clientEntity.getId())
                .clientName(clientEntity.getClientName())
                .balance(clientEntity.getBalance())
                .build();
    }

    public static BigDecimal toDtoBalance(ClientEntity clientEntity) {
        return ClientDto.builder()
                .balance(clientEntity.getBalance())
                .build().getBalance();
    }

    public static ClientEntity toEntity(ClientDto clientDto) {
        return ClientEntity.builder()
                .id(clientDto.getId())
                .clientName(clientDto.getClientName())
                .balance(clientDto.getBalance())
                .build();
    }

}