package com.store.store.entities.tests;

import com.store.store.entities.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ManyToOne")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManyToOneEntity extends BaseEntity {
    private String name;

    private Integer number;

    private Float decimall;
}
