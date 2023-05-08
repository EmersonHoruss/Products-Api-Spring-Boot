package com.store.store.DTOs.products.productSalePrice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@Builder
public class ProductSalePriceSaveDTO {
    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private float price;

    @NotNull
    private long productId;

    @NotNull
    private long salePriceId;
}

