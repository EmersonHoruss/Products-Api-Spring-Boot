package com.store.store.DTOs.entities.products;

import com.store.store.DTOs.entities.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class PhotoDTO extends BaseDTO {
    @NotBlank
    private byte[] photo;

    @Size(max = 90)
    private String name;

    @Size(max = 256)
    private String description;
}
