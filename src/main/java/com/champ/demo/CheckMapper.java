package com.champ.demo;

import com.alibaba.fastjson.JSON;
import com.champ.demo.dto.StudentDto;

public class CheckMapper {
    public static void main(String[] args) {
        String json  = "{\"addressDtos\":[{\"name\":\"gsdhew\"},{\"name\":\"chagpdsafasdoagin\"}],\"name\":\"dsaaing\",\"point\":{23.5:66.365}}";
        StudentDto nd =  JSON.parseObject(json,StudentDto.class);

        System.out.println(nd.getName());
    }
}
