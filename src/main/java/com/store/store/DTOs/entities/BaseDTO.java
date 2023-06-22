package com.store.store.DTOs.entities;

import com.store.store.constants.OperationDTOConstant;
import com.store.store.exceptions.RequireIdException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  class BaseDTO {
    private Long id;

    private Boolean activated;

    public void validate(OperationDTOConstant operation){
        if(!isValidWhenUpdate(operation)){
            throw new RequireIdException(getClass(),id);
        }
    }

    private boolean isValidWhenUpdate(OperationDTOConstant operation) {
        return operation == OperationDTOConstant.UPDATE && id!=null && id>=0;
    }

}
