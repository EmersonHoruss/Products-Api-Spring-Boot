package com.store.store.entities.tests;

import com.store.store.entities.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OneToMany")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OneToManyEntity extends BaseEntity {
    private String name;

    private Integer number;

    private Float decimall;
}
