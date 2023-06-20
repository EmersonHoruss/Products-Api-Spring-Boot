package com.store.store.utils.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.lang.reflect.Type;

public class Mapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Mapper(){
        modelMapper = new ModelMapper();
        //modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    }

    public <Destination> Destination map(Object source, Type destinationType) {
        return modelMapper.map(source, destinationType);
    }
}
