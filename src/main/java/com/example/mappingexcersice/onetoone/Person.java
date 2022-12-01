package com.example.mappingexcersice.onetoone;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
public class Person {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personID;

    @Getter
    @Setter
    @OneToOne(mappedBy = "person")
    private Address add;
    @Getter
    @Setter
    private String name;

    public Address getAdd() {
        return add;
    }

    public String getName() {
        return name;
    }


}
