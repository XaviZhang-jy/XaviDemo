package com.demo.MybatisDemo.mapper;

import com.demo.MybatisDemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhang
 */
@Mapper
public interface StudentMapper {
    /**
     * 查询所有
     * @return
     */
    List<Student> findAll();
}
