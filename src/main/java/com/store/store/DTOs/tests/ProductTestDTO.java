package com.store.store.DTOs.tests;

import com.store.store.DTOs.BaseEntityDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductTestDTO extends BaseEntityDTO {
    private RequiredIdDTO type;
    private RequiredIdDTO brand;
}
