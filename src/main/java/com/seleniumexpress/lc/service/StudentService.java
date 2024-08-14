package com.seleniumexpress.lc.service;

import java.util.List;

import com.seleniumexpress.lc.pojo.student;

public interface StudentService {
List<student> loadStudents();

void savingstu(student std);

student getstudent(int id);

void updatestu(student student);

int deletestudent(int id);
}
