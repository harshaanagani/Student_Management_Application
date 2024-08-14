package com.seleniumexpress.lc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.lc.dao.StudentDao;
import com.seleniumexpress.lc.pojo.StudentDto;
import com.seleniumexpress.lc.pojo.student;
import com.seleniumexpress.lc.service.StudentService;



@Controller
public class StudentController {
	//@Autowired
	//private StudentDao sdao;
	@Autowired
	private StudentService service;
	
	
	@RequestMapping("/showstudents")
public String showrestudents(Model model) {
		
       List<student> students = service.loadStudents();
       
       model.addAttribute("students1",students);
	    return "hello-world";
}
@RequestMapping("/showstudentpage")
	public String addstudent(@ModelAttribute("students2")student std2) {
		    
		    return "add-student";
	}

@PostMapping("/save-student")
public String Savestudent(student std) {

if(std.getId()==0) {
	service.savingstu(std);
}else {
	service.updatestu(std);
}
    System.out.println(std);
    return "redirect:/showstudents";
}
 
@RequestMapping("/updatestudents")
public String updatestudents(@RequestParam("userId") int id, Model model) {
	
	System.out.println(id);
   student getstudent = service.getstudent(id);
   System.out.println(getstudent);
   model.addAttribute("students2",getstudent);
    return "add-student";
}

@RequestMapping("/deletestudents")
public String delstudents(@RequestParam("userId") int id, Model model) {
	
	System.out.println(id);
   int getstudent = service.deletestudent(id);
   //System.out.println(getstudent);
   
    return "redirect:/showstudents";
}

}
