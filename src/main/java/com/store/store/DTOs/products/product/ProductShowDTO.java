package com.store.store.DTOs.products.product;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import com.store.store.DTOs.products.size.SizeShowDTO;
import com.store.store.DTOs.products.type.TypeShowDTO;
import com.store.store.DTOs.products.brand.BrandShowDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class ProductShowDTO extends BaseAfterSaveEntityDTO {
    @PositiveOrZero
    private short amount;

    @Size(max = 180)
    private String name;

    @Size(max = 256)
    private String description;

    @NotNull
    private BrandShowDTO brand;

    @NotNull
    private SizeShowDTO size;

    @NotNull
    private TypeShowDTO type;
}
