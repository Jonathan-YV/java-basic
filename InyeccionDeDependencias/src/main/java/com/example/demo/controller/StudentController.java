package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
    	Student st1 = new Student("1",1,"Jonathan","Vazquez",2);
    	Student st2 = new Student("2",3,"Yair","Uriostegui",3);
    	Student st3 = new Student("3",34,"Carlos","Jesus",4);
    	studentService.add(st1);
    	studentService.add(st2);
    	studentService.add(st3);
        return studentService.findById( id );
    }

}
