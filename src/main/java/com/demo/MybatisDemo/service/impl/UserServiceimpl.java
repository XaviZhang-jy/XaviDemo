package com.demo.MybatisDemo.service.impl;

import com.demo.MybatisDemo.entity.Student;
import com.demo.MybatisDemo.mapper.StudentMapper;
import com.demo.MybatisDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class UserServiceimpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
