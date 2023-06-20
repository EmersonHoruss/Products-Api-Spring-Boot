package com.store.store.DTOs.products.productPhoto;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import com.store.store.DTOs.products.photo.PhotoShowDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ProductPhotoShowDTO extends BaseAfterSaveEntityDTO {
    @NotNull
    private PhotoShowDTO photo;
}
