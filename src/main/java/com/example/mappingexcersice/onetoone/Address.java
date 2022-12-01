package com.example.mappingexcersice.onetoone;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Getter
    @Setter
    private String houseName;
    @Getter
    @Setter
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="P_ID",referencedColumnName = "personID")
    private Person person;

}