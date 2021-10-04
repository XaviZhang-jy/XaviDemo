package com.demo.MybatisDemo.service;

import com.demo.MybatisDemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhang
 */
@Service
public interface StudentService {
    List<Student> findAll();
}
