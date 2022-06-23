package com.itfei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfei.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
