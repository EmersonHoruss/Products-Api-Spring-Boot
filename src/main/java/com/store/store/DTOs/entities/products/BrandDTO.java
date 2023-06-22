package com.store.store.DTOs.entities.products;

import com.store.store.DTOs.entities.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class BrandDTO extends BaseDTO {
    @Size(min = 1, max = 45)
    private String name;
}
