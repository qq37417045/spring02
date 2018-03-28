package com.qf.action.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/2/6.
 */
@Repository("TeacherDao")
public class TeacherDaoImpl implements TeacherDao{
    public void Teacher() {
        System.out.println("老师来了啊");
    }
}
