package com.store.store.DTOs.products.brand;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class BrandSaveDTO extends BaseEntityDTO {
	@Size(min = 1, max = 45)
	@NotNull
	private String name;
}

