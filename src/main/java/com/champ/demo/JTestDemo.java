package com.champ.demo;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JTestDemo {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonGenerator jsonGenerator = objectMapper.getJsonFactory()
                .createJsonGenerator(System.out, JsonEncoding.UTF8);
        objectMapper.writeValue(System.out, Facotry.get());//直接输出到控制台
    }
}
