package com.api.mock.Mock_server;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@ToString
@Entity
public class Employee {
    @Id
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }
}
