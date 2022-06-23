package com.iefei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iefei.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {

}
