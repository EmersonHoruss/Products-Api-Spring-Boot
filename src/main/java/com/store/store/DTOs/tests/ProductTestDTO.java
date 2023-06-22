package com.store.store.DTOs.tests;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductTestDTO {
    private RequiredIdDTO type;
    private RequiredIdDTO brand;
}
