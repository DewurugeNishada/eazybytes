package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api",produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {


    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createdAccount(@RequestBody CustomerDto customerDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto());
    }



}
