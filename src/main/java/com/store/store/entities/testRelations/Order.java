package com.store.store.entities.testRelations;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
