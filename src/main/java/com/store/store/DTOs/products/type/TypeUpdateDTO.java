package com.store.store.DTOs.products.type;

import com.store.store.DTOs.BaseAfterSaveEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class TypeUpdateDTO extends BaseAfterSaveEntityDTO {
    @Size(min = 1, max = 90)
    private String name;
}
