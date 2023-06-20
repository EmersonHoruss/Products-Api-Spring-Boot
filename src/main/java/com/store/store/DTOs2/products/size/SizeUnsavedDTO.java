package com.store.store.DTOs2.products.size;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class SizeUnsavedDTO {
    @Size(min = 1, max = 20)
    private String name;
}
