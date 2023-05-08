package com.store.store.DTOs.products.productPhoto;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@SuperBuilder
public class ProductPhotoUpdateDTO extends BaseDTO {
    @NotNull
    private Long photoId;
}
