package com.champ.demo.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class StudentDto {
    private String name;
    private List<AddressDto> addressDtos;
    private HashMap<Float,Float> point;
}
