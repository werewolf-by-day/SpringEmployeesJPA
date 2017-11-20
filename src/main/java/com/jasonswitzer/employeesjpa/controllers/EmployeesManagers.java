package com.jasonswitzer.employeesjpa.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jasonswitzer.employeesjpa.models.Employee;
import com.jasonswitzer.employeesjpa.services.EmployeeService;

@Controller
public class EmployeesManagers {
	
	private EmployeeService employeeService;
	
	public EmployeesManagers(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		Employee michael = employeeService.findEmployeeById(Long.valueOf(1));
		List<Employee> michaelsEmployees = employeeService.findEmployeesOfManager(michael);
		model.addAttribute("michaelsEmployees", michaelsEmployees);
		
		Employee dwight = employeeService.findEmployeeById(Long.valueOf(3));
		List<Employee> dwightsEmployees = employeeService.findEmployeesOfManager(dwight);
		model.addAttribute("dwightsEmployees", dwightsEmployees);
		
		List<Employee> dwightsManagers = employeeService.findManagersOfEmployee(dwight);
		model.addAttribute("dwightsManagers", dwightsManagers);
		
		Employee jim = employeeService.findEmployeeById(Long.valueOf(2));
		List<Employee> jimsManagers = employeeService.findManagersOfEmployee(jim);
		model.addAttribute("jimsManagers", jimsManagers);
		
		return "index.jsp";
}

}
