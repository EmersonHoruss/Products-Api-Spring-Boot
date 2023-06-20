package com.store.store.DTOs.products.size;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class SizeSaveDTO extends BaseEntityDTO {
    @Size(min = 1, max = 20)
    private String name;
}

