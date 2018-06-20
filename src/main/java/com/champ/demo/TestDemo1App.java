package com.champ.demo;

import com.alibaba.fastjson.JSON;
import com.champ.demo.dto.AddressDto;
import com.champ.demo.dto.StudentDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDemo1App {
    public static void main(String[] args) {


        System.out.println(JSON.toJSONString(Facotry.get()));
    }

}
