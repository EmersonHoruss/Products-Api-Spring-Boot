package com.store.store.DTOs2.products.brand;

import com.store.store.DTOs2.BaseSavedDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class BrandSavedDTO extends BaseSavedDTO {
    @Size(min = 1, max = 45)
    @NotNull
    private String name;
}
