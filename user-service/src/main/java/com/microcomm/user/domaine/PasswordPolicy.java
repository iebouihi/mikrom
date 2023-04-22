package com.microcomm.user.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "password-policies")
public class PasswordPolicy {
    @Id
    String code;
    @Column
    String name;
    @Column
    int value;
}
