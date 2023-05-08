package com.store.store.DTOs.products.size;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class SizeSaveDTO {
    @Size(min = 1, max = 20)
    private String name;
}

