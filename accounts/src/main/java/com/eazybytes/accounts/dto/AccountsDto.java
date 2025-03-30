package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class AccountsDto {


    private Long accountNumber;

    private Long customerId;

    private String accountType;

    private String branchAddress;
}
