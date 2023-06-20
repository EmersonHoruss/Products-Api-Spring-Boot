package com.store.store.DTOs.products.photo;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class PhotoSaveDTO extends BaseEntityDTO {
    @NotBlank
    private byte[] photo;

    @Size(max = 90)
    private String name;

    @Size(max = 256)
    private String description;
}

