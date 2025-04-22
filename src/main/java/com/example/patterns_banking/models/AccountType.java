package com.example.patterns_banking.models;

import lombok.Data;
import lombok.NoArgsConstructor;

public enum AccountType {
    CHECKING("CHECKING"),
    SAVINGS("SAVINGS"),
    LOAN("LOAN");

    private String name;

    AccountType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
