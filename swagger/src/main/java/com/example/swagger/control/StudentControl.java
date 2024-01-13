package com.example.swagger.control;

import com.example.swagger.dto.StudentDto;
import com.example.swagger.model.Student;
import com.example.swagger.response.StudentResponse;
import com.example.swagger.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Api(value = "Ögrenci işleri kontrol")
public class StudentControl {

    private final StudentService studentService;

    public StudentControl(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    @ApiOperation(value = "Ogrenci kaydetme metodu", notes = "Bu metodu dikkatli kullan")
    public StudentResponse addStudent(@RequestBody @ApiParam(value = "Ogrenci") StudentDto studentdto){
        return studentService.addStudent(studentdto);
    }
    @GetMapping("/find/{studentId}")
    @ApiOperation(value = "Ogrenci bulma metodu", notes = "Bu metodu dikkatli kullan")
    public ResponseEntity<StudentDto> findStudent(@PathVariable @ApiParam(value = "Ogrenci")int studentId){
        return (studentService.findStudent(studentId));
    }

    @DeleteMapping("/delete/{studentId}")
    @ApiOperation(value = "Ogrenci silme metodu", notes = "Bu metodu dikkatli kullan")
    public ResponseEntity<Boolean> deleteStudent(@PathVariable @ApiParam (value = "Ogrenci")int studentId){
        Boolean delete=studentService.deleteStudent(studentId);
        return ResponseEntity.ok(delete);


    }
    @PutMapping("edit/{studentId}")
    @ApiOperation(value = "Ogrenci guncelleme metodu", notes = "Bu metodu dikkatli kullan")
    public ResponseEntity<Student> updateStudent(@PathVariable (name = "studentId") int studentId ,@RequestBody @ApiParam(value = "Ogrenci") Student student){
        Student result=studentService.updateStudent(studentId,student);
        return ResponseEntity.ok(result);
    }
}
