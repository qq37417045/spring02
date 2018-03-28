package com.qf.action.service;

import com.qf.action.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/6.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    @Qualifier("TeacherDao")
    private TeacherDao dao;

    @Value("张连长")
    private String name;



    public void setName(String name) {
        this.name = name;
    }

    public void setDao(TeacherDao dao) {
        this.dao = dao;
    }

    public void student() {
        dao.Teacher();
        System.out.println(name+"在学习");
    }
}
