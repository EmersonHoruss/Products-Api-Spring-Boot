package com.store.store.DTOs.products.product;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class ProductUpdateDTO extends BaseDTO {
    @PositiveOrZero
    private short amount;

    @Size(max = 180)
    private String name;

    @Size(max = 256)
    private String description;

    @NotNull
    private Long brandId;

    @NotNull
    private Long sizeId;

    @NotNull
    private Long typeId;
}
