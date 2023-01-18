package com.api.atm_machine.repository;

import com.api.atm_machine.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}