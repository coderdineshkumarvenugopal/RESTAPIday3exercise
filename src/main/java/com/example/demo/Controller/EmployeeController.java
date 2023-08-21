package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService es;

@PostMapping("addemployee")
public Employee add(@RequestBody Employee e)
{
	return es.saveinfo(e);
}

@GetMapping("showdetails")
public List<Employee> show()
{
	return es.showinfo();
}
}
