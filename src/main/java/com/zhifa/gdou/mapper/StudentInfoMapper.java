package com.zhifa.gdou.mapper;

import com.zhifa.gdou.model.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);

    StudentInfo selectByOpenId(@Param("openId") String openId);

    StudentInfo selectByStudentNumAndStudentPass(@Param("studentNum") String studentNum, @Param("studentPass") String studentPass);

    String findNameByNum(@Param("studentNum") String studentNum);

    StudentInfo findStuInfo(@Param("studentNum") String studentNum);

    int updateOpenIdByOpenId(@Param("openId") String openId);


    List<StudentInfo> findAllStudents(@Param("studentname") String studentname);

    String findOpenIdByStuNo(@Param("studentNum") String studentNum);

    /**
     * 学生通讯录
     */
    List<StudentInfo> findTxl(@Param("studentNum") String studentNum);

}