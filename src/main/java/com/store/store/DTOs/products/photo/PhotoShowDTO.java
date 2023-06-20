package com.store.store.DTOs.products.photo;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class PhotoShowDTO extends BaseAfterSaveEntityDTO {
    @NotBlank
    private byte[] photo;

    @Size(max = 90)
    private String name;

    @Size(max = 256)
    private String description;
}
