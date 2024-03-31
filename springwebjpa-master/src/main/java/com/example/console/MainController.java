package com.example.console;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    /* http://localhost:8080/getEmployeeData */
    @GetMapping("getEmployeeData")
    public String getEmployeeData(Model model) {
        List<Employee> employeeData = employeeRepository.findAll();
        // get employee id in ascending order 
        Collections.sort(employeeData, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
            	Integer empid1 = Integer.valueOf(o1.getEmpid());
            	Integer empid2 = Integer.valueOf(o2.getEmpid());
                return empid1.compareTo(empid2);
            }
        });
        
        
        model.addAttribute("employeeData", employeeData);
        return "EmployeeInfo";
    }
}
