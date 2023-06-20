package com.store.store.DTOs2.products.type;

import com.store.store.DTOs2.BaseSavedDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class TypeSavedDTO extends BaseSavedDTO {
    @Size(min = 1, max = 90)
    private String name;
}
