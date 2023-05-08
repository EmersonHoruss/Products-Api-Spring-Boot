package com.store.store.DTOs.products.brand;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class BrandSaveDTO{
	@Size(min = 1, max = 45)
	private String name;
}

