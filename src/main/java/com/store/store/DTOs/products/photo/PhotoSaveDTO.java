package com.store.store.DTOs.products.photo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class PhotoSaveDTO {
    @NotBlank
    private byte[] photo;

    @Size(max = 90)
    private String name;

    @Size(max = 256)
    private String description;
}

