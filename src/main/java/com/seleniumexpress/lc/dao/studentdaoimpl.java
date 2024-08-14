package com.seleniumexpress.lc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.lc.pojo.student;
import com.seleniumexpress.lc.rowmap.StudentRowMapper;
@Repository
public class studentdaoimpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<student> loadstudents() {
		
		String sql="select * from stable";
		List<student> query = jdbcTemplate.query(sql, new StudentRowMapper());
		return query;
	}
	@Override
	public void savingstu(student student) {
		Object[] arr= {student.getName(),student.getMobile(),student.getCountry()};
		String sql="insert into stable(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql, arr);
		System.out.println("1 row inserted...");
	}
	@Override
	public student getStudent(int id) {
		String sql="select * from stable where id=?";
		student queryForObject = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return queryForObject;
	}
	@Override
	public void updatestu(student student) {
		Object[] arr= {student.getName(),student.getMobile(),student.getCountry(),student.getId()};
		String sql="update stable set name=?,mobile=?,country=? where id=?";
		jdbcTemplate.update(sql, arr);
		System.out.println("1 row updated...");
	}
	@Override
	public int deletestudent(int id) {
		
		String sql="delete from stable where id=?";
		int up = jdbcTemplate.update(sql, id);
		return up;
	}
}
