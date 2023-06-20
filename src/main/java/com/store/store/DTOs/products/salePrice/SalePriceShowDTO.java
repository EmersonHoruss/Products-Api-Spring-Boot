package com.store.store.DTOs.products.salePrice;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class SalePriceShowDTO extends BaseAfterSaveEntityDTO {
    @Size(min = 1, max = 45)
    private String name;

    @Size(max = 256)
    private String description;

    @PositiveOrZero
    private short min;

    @PositiveOrZero
    private short max;
}
