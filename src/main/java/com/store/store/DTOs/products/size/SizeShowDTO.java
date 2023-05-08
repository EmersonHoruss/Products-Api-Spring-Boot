package com.store.store.DTOs.products.size;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class SizeShowDTO extends BaseDTO {
    @Size(min = 1, max = 20)
    private String name;
}
