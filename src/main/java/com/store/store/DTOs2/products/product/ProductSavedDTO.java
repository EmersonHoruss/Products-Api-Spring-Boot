package com.store.store.DTOs2.products.product;

import com.store.store.DTOs2.BaseSavedDTO;
import com.store.store.DTOs2.IdAsEntityDTO;
import com.store.store.DTOs2.products.brand.BrandSavedDTO;
import com.store.store.DTOs2.products.size.SizeSavedDTO;
import com.store.store.DTOs2.products.type.TypeSavedDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProductSavedDTO extends BaseSavedDTO {
    @PositiveOrZero
    private short amount;

    @Size(max = 180)
    private String name;

    @Size(max = 256)
    private String description;

    @NotNull
    private BrandSavedDTO brand;

    @NotNull
    private SizeSavedDTO size;

    @NotNull
    private TypeSavedDTO type;
}
