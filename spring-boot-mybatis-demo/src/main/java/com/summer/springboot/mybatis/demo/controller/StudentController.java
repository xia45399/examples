package com.summer.springboot.mybatis.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.summer.springboot.mybatis.demo.pojo.Student;
import com.summer.springboot.mybatis.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("listStudentsPage")
    public PageInfo<Student> listStudentsPage() {
        PageHelper.startPage(2, 2);
        List<Student> list = studentService.listStudentsPage();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
