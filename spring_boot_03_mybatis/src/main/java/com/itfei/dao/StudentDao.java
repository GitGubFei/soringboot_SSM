package com.itfei.dao;

import com.itfei.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {
    @Select("select * from tb_student where stu_id = #{stu_id}")
    public Student getStuById(Integer stu_id);
}
