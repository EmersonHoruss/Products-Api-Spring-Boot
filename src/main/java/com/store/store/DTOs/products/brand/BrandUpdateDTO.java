package com.store.store.DTOs.products.brand;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class BrandUpdateDTO extends BaseDTO {
    @Size(min = 1, max = 45)
    private String name;
}
