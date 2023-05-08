package com.store.store.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class BaseDTO {
    private Long id;

    private boolean isActivated;
}
