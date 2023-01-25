package com.api.atm_machine.controllers;

import com.api.atm_machine.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example7Controller {
    @GetMapping(value = "/testExtendsControllerAdvice")
    public ResponseEntity<?> testExtendsControllerAdvice(@RequestBody Response response) {
        return  ResponseEntity.ok(response);
    }
}

