package com.store.store.entities.tests;

import com.store.store.entities.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Root")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RootEntity extends BaseEntity {
    private String name;

    private Integer number;

    private Float decimall;

    @ManyToOne
    private ManyToOneEntity manyToOne;

   @ManyToMany
    private List<OneToManyEntity> oneToMany;
}
