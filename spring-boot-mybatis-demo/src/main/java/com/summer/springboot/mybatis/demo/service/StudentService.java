package com.summer.springboot.mybatis.demo.service;

import com.summer.springboot.mybatis.demo.dao.StudenMapper;
import com.summer.springboot.mybatis.demo.pojo.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudenMapper studenMapper;

    public List<Student> listAllStudents() {
        return studenMapper.listAllStudents();
    }

    @Cacheable(value = "data", key = "'Student-' + #id")
    public Student getStudentById(Long id) {
        return studenMapper.getStudentById(id);
    }

    public List<Student> listStudentsPage() {
        return studenMapper.listStudentsPage();
    }
}
