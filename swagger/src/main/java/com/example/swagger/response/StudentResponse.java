package com.example.swagger.response;

import com.example.swagger.dto.StudentDto;

import java.io.Serializable;

public class StudentResponse extends BaseResponse implements Serializable {
    public StudentDto student;
}
