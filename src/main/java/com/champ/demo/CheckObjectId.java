package com.champ.demo;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CheckObjectId {
    public static void main(String[] args) throws IOException {
        System.out.println(JSON.toJSONString(Facotry.getmodel()));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonGenerator jsonGenerator = objectMapper.getJsonFactory()
                .createJsonGenerator(System.out, JsonEncoding.UTF8);

        System.out.println("-------***------");
        objectMapper.writeValue(System.out, Facotry.getmodel());//直接输出到控制台

    }
}
