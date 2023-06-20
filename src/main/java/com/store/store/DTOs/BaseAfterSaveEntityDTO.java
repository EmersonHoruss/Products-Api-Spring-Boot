package com.store.store.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class BaseAfterSaveEntityDTO extends BaseEntityDTO {
    @NotNull
    private Long id;

    @NotNull
    private boolean isActivated;
}
