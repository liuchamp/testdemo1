package com.champ.demo;

import com.champ.demo.dto.AddressDto;
import com.champ.demo.dto.StudentDto;
import com.champ.demo.model.Student;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Facotry {
    public static StudentDto getdto()  {
        StudentDto dto =  new StudentDto();
        dto.setName("dsaaing");
        AddressDto addressDto =  new AddressDto();
        addressDto.setName("gsdhew");
        HashMap<Float,Float> d = new HashMap<>();
        d.put(23.5F,66.365F);

        List<AddressDto> dtoList  = new ArrayList<>();
        dtoList.add(addressDto);
        dtoList.add(new AddressDto("chagpdsafasdoagin"));
        dto.setAddressDtos(dtoList);
        dto.setPoint(d);
        return dto;
    }

    public static StudentDto getmodel()  {
        Student dto =  new Student();
        dto.setName("dsaaing");
        AddressDto addressDto =  new AddressDto();
        addressDto.setName("gsdhew");
        HashMap<Float,Float> d = new HashMap<>();
        d.put(23.5F,66.365F);

        List<AddressDto> dtoList  = new ArrayList<>();
        dtoList.add(addressDto);
        dtoList.add(new AddressDto("chagpdsafasdoagin"));
        dto.setAddressDtos(dtoList);
        dto.setPoint(d);
        dto.setId(new ObjectId("5b2b16c5bfe52300018d9bba"));
        return dto;
    }
}
