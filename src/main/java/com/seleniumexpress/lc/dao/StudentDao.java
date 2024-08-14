package com.seleniumexpress.lc.dao;

import java.util.List;

import com.seleniumexpress.lc.pojo.student;

public interface StudentDao {
List<student> loadstudents();

void savingstu(student student);

student getStudent(int id);

void updatestu(student student);

int deletestudent(int id);
}
