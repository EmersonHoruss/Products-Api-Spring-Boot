package com.store.store.DTOs.entities.products;

import com.store.store.DTOs.entities.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
public class ProductSalePriceDTO extends BaseDTO {
    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private float price;

    @NotNull
    private SalePriceDTO salePrice;
}
