package com.store.store.DTOs.products.type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class TypeSaveDTO {
    @Size(min = 1, max = 90)
    private String name;
}

