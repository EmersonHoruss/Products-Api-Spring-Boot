package com.store.store.entities.testRelations;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {


    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn( name = "fk_order_id", referencedColumnName = "id")
    List<Order> orders = new ArrayList<>();
}
