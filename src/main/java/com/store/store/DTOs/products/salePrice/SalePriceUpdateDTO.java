package com.store.store.DTOs.products.salePrice;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class SalePriceUpdateDTO extends BaseDTO {
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
