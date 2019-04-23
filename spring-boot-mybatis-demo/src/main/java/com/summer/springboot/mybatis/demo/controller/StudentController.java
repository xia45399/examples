package com.summer.springboot.mybatis.demo.controller;

import com.summer.springboot.mybatis.demo.pojo.Student;
import com.summer.springboot.mybatis.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/listAllStudents")
    public Object listAllStudents() {
        return studentService.listAllStudents();
    }

    @RequestMapping("/getStudentById")
    public Student getStudentById(long id) {
        return studentService.getStudentById(id);
    }
}
