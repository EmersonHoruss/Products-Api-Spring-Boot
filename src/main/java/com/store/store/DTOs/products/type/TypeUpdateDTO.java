package com.store.store.DTOs.products.type;

import com.store.store.DTOs.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Size;

@Getter
@Setter
@SuperBuilder
public class TypeUpdateDTO extends BaseDTO {
    @Size(min = 1, max = 90)
    private String name;
}
