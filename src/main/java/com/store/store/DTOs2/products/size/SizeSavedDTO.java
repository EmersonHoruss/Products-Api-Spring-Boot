package com.store.store.DTOs2.products.size;

import com.store.store.DTOs2.BaseSavedDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class SizeSavedDTO extends BaseSavedDTO {
    @Size(min = 1, max = 20)
    private String name;
}
