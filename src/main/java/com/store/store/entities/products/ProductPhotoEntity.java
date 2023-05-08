package com.store.store.entities.products;

import com.store.store.entities.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ProductPhoto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPhotoEntity extends BaseEntity {
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    private PhotoEntity photo;
}
