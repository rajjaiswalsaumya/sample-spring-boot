package com.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {
    private String emailId;
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }
}
