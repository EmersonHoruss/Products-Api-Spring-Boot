package com.store.store.DTOs.products.productSalePrice;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@SuperBuilder
public class ProductSalePriceUpdateDTO extends BaseDTO {
    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private float price;

    @NotNull
    private long salePriceId;
}
