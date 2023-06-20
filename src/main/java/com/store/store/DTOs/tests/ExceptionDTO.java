package com.store.store.DTOs.tests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ExceptionDTO {
    @Size(max = 10)
    private String name;

    @Size(max = 1)
    private String unique;

    @PositiveOrZero
    private String number;

    @Digits(integer = 4, fraction = 2)
    private String decimall;
}
