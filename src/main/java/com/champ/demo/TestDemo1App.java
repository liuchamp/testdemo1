package com.champ.demo;

import com.alibaba.fastjson.JSON;
import com.champ.demo.dto.AddressDto;
import com.champ.demo.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class TestDemo1App {
    public static void main(String[] args) {
        StudentDto dto =  new StudentDto();
        dto.setName("dsaaing");
        AddressDto addressDto =  new AddressDto();
        addressDto.setName("gsdhew");


        List<AddressDto> dtoList  = new ArrayList<>();
        dtoList.add(addressDto);
        dtoList.add(new AddressDto("chagpdsafasdoagin"));dto.setAddressDtos(dtoList);

        System.out.println(JSON.toJSONString(dto));
    }

}
