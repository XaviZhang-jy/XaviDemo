package com.demo.MybatisDemo.api;

import com.demo.MybatisDemo.entity.Student;
import com.demo.MybatisDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhang
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
