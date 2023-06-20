package com.store.store.DTOs2.products.product;

import com.store.store.DTOs2.IdAsEntityDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProductUnsavedDTO {
    @PositiveOrZero
    private short amount;

    @Size(max = 180)
    private String name;

    @Size(max = 256)
    private String description;

    @NotNull
    private IdAsEntityDTO brand;

    @NotNull
    private IdAsEntityDTO size;

    @NotNull
    private IdAsEntityDTO type;
}
