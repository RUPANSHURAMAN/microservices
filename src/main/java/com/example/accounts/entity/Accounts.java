package com.example.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customeId;

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
