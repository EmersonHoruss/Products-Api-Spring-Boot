package com.store.store.DTOs2.products.type;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class TypeUnsavedDTO {
    @Size(min = 1, max = 90)
    private String name;
}
