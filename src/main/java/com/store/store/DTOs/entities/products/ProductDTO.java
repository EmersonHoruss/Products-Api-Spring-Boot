package com.store.store.DTOs.entities.products;

import com.store.store.DTOs.entities.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProductDTO extends BaseDTO {
    @PositiveOrZero
    private short amount;

    @Size(max = 180)
    private String name;

    @Size(max = 256)
    private String description;

    @NotNull
    private BrandDTO brand;

    @NotNull
    private SizeDTO size;

    @NotNull
    private TypeDTO type;
}
