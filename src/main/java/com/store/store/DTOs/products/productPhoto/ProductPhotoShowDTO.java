package com.store.store.DTOs.products.productPhoto;

import com.store.store.DTOs.BaseDTO;
import com.store.store.DTOs.products.photo.PhotoShowDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@SuperBuilder
public class ProductPhotoShowDTO extends BaseDTO {
    @NotNull
    private PhotoShowDTO photo;
}
