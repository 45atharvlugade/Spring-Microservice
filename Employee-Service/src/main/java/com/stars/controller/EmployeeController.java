package com.stars.controller;

import org.springframework.web.bind.annotation.*;

import com.stars.dto.EmployeeDTO;
import com.stars.entity.Employee;
import com.stars.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private IEmployeeService service;

    public EmployeeController(IEmployeeService service) {
        this.service = service;
    }

    // =========================
    // REGISTER EMPLOYEE
    // =========================
    @PostMapping("/register")
    public String registerEmployee(@RequestBody Employee employee) {
        return service.registerEmployee(employee);
    }

    // =========================
    // GET EMPLOYEE BY ID (WITH DEPARTMENT)
    // =========================
    @GetMapping("/{id}")
    public EmployeeDTO searchEmployee(@PathVariable Integer id) {
        return service.searchEmployee(id);
    }

    // =========================
    // DELETE EMPLOYEE
    // =========================
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        return service.deleteEMployee(id);
    }
}