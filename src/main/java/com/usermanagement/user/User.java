package com.usermanagement.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userid;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
