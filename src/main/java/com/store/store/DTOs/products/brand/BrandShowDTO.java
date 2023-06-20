package com.store.store.DTOs.products.brand;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class BrandShowDTO extends BaseAfterSaveEntityDTO {
    @Size(min = 1, max = 45)
    private String name;
}
