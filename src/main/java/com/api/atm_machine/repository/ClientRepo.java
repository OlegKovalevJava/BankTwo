package com.api.atm_machine.repository;

import com.api.atm_machine.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<ClientEntity, Long> {
}