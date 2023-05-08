package com.store.store.DTOs.products.photo;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class PhotoShowDTO extends BaseDTO {
    @NotBlank
    private byte[] photo;

    @Size(max = 90)
    private String name;

    @Size(max = 256)
    private String description;
}
