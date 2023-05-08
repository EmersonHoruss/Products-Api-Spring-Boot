package com.store.store.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@SuperBuilder
public class BaseDTO {
    @NotNull
    private Long id;

    @NotNull
    private boolean isActivated;
}
