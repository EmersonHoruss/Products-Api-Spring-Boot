package com.store.store.entities.testRelations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "adress")
@Getter
@Setter
@ToString
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="street")
    private String street;

    @Column(name="number")
    private int number;

    @Column(name="people")
    private String people;
}
