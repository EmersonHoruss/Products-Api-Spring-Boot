package com.store.store.DTOs.products.productSalePrice;

import com.store.store.DTOs.BaseDTO;
import com.store.store.DTOs.products.salePrice.SalePriceShowDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@SuperBuilder
public class ProductSalePriceShowDTO extends BaseDTO {
    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private float price;

    @NotNull
    private SalePriceShowDTO salePrice;
}
