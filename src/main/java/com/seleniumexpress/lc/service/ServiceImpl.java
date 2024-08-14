package com.seleniumexpress.lc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.lc.dao.StudentDao;
import com.seleniumexpress.lc.pojo.student;
@Service
public class ServiceImpl implements StudentService{
	@Autowired
    StudentDao dao;
	@Override
	public List<student> loadStudents() {
		List<student> studentlist= dao.loadstudents();
		return studentlist;
	}
	@Override
	public void savingstu(student std) {
		// TODO Auto-generated method stub
		dao.savingstu(std);
	}
	@Override
	public student getstudent(int id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}
	@Override
	public void updatestu(student student) {
		// TODO Auto-generated method stub
		 dao.updatestu(student);
	}
	@Override
	public int deletestudent(int id) {
		// TODO Auto-generated method stub
		return dao.deletestudent(id);
	}


}
