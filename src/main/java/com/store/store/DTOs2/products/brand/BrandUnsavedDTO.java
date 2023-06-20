package com.store.store.DTOs2.products.brand;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class BrandUnsavedDTO {
    @Size(min = 1, max = 45)
    @NotNull
    private String name;
}
