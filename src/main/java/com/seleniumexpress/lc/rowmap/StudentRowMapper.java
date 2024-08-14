package com.seleniumexpress.lc.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.seleniumexpress.lc.pojo.student;

public class StudentRowMapper implements RowMapper<student>{

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
      student std=new student();
      std.setId(rs.getInt("id"));
      std.setName(rs.getString("name"));
      std.setMobile(rs.getLong("mobile"));
      std.setCountry(rs.getString("country"));
		return std;
	}

}
