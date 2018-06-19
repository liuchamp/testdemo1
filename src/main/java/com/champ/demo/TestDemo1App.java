package com.champ.demo;

import com.alibaba.fastjson.JSON;
import com.champ.demo.dto.AddressDto;
import com.champ.demo.dto.StudentDto;

public class TestDemo1App {
    public static void main(String[] args) {
        StudentDto dto =  new StudentDto();
        dto.setName("dsaaing");
        AddressDto addressDto =  new AddressDto();
        addressDto.setName("gsdhew");
        dto.setAddressDto(addressDto);

        System.out.println(JSON.toJSONString(dto));
    }

}
