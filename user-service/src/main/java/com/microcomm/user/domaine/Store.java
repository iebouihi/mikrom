package com.microcomm.user.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Store {
    @Id
    String id;
    @Column
    String name;
}
