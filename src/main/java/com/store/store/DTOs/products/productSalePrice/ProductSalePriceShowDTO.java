package com.store.store.DTOs.products.productSalePrice;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import com.store.store.DTOs.products.salePrice.SalePriceShowDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@NoArgsConstructor
public class ProductSalePriceShowDTO extends BaseAfterSaveEntityDTO {
    @PositiveOrZero
    @Digits(integer = 4, fraction = 2)
    private float price;

    @NotNull
    private SalePriceShowDTO salePrice;
}
