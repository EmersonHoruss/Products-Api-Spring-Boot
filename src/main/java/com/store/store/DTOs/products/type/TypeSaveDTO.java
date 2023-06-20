package com.store.store.DTOs.products.type;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class TypeSaveDTO extends BaseEntityDTO {
    @Size(min = 1, max = 90)
    private String name;
}

