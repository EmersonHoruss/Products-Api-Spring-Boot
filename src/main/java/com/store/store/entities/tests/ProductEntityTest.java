package com.store.store.entities.tests;

import com.store.store.entities.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductEntityTest extends BaseEntity{
    private TypeEntityTest type;
    private BrandEntityTest brand;
}
