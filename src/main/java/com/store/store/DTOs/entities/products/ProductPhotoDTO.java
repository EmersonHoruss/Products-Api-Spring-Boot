package com.store.store.DTOs.entities.products;

import com.store.store.DTOs.entities.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ProductPhotoDTO extends BaseDTO {
    @NotNull
    private ProductDTO product;

    @NotNull
    private PhotoDTO photo;
}
