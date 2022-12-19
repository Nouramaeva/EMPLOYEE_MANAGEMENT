package com.example.demo.controller

import com.example.demo.model.EmployeeDTO
import com.example.demo.service.EmployeeService
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.web.bind.annotation.*

class EmployeeController {

@RestController    //controller --> service --> repository (
@RequestMapping("/v1/employees")
class EmployeeController (private val employeeService: EmployeeService) {

    @GetMapping
    fun getEmployee(): List<EmployeeDTO> {
        return employeeService.getEmployees()
    }

    @PostMapping
    fun addEmployee(@RequestBody employee:EmployeeDTO ): Any? {
       return employeeService.addEmployee(employee)
   }

    @DeleteMapping
    fun deleteEmployee(@RequestBody employee:EmployeeDTO ): EmployeeDTO{

        return employeeService.deleteEmployee(employee)
    }

}
}