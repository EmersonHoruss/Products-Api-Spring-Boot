package com.store.store.DTOs.products.productPhoto;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ProductPhotoSaveDTO extends BaseEntityDTO {
    @NotNull
    private Long productId;

    @NotNull
    private Long photoId;
}

