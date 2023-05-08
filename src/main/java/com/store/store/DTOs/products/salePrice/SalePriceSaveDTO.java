package com.store.store.DTOs.products.salePrice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class SalePriceSaveDTO {
    @Size(min = 1, max = 45)
    private String name;

    @Size(max = 256)
    private String description;

    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private short min;

    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private short max;
}

