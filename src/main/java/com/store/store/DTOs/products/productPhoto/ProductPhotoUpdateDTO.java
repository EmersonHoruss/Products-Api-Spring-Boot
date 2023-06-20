package com.store.store.DTOs.products.productPhoto;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ProductPhotoUpdateDTO extends BaseAfterSaveEntityDTO {
    @NotNull
    private Long photoId;
}
