package com.example.swagger.model;

import com.example.swagger.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@ApiModel(value = "Ogrenci" , description = "Ogrenci bilgilerini icerir.")
@ToString
public class Student  extends BaseEntity implements Serializable{


        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        @ApiModelProperty(value = "id")
        private int studentId;

        @ApiModelProperty(value = "ad")
        private String name;

        @ApiModelProperty(value = "soyad")
        private String surname;

        @ApiModelProperty(value = "telefon numarası")
        private String phoneNumber;

        @ApiModelProperty(value = "dogum gunu")
        private String birthDay;




        public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Student() {
    }

    public Student(int studentId, String name, String surname, String phoneNumber, String birthDay) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;

    }
}