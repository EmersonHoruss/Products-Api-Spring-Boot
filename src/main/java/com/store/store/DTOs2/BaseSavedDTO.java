package com.store.store.DTOs2;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BaseSavedDTO {
    @NotNull
    private Long id;

    @NotNull
    private boolean activated;
}
