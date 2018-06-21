package com.champ.demo.model;

import com.champ.demo.dto.StudentDto;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class Student extends StudentDto {
    private ObjectId id;
}
