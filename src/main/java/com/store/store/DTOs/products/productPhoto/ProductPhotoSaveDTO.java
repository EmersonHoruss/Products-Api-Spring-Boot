package com.store.store.DTOs.products.productPhoto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
public class ProductPhotoSaveDTO  {
    @NotNull
    private Long productId;

    @NotNull
    private Long photoId;
}

