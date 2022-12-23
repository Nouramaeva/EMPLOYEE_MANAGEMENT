package com.example.demo.service

import com.example.demo.model.EmployeeDTO
import com.example.demo.repositories.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {




    fun getEmployees(): List<EmployeeDTO>{
        return employeeRepository.fetchEmployees()
    }


    fun addEmployee(employee: EmployeeDTO ): Any? {
        if ((employeeRepository.getEmployeeById(employee.employeeId) == null)
            && (employeeRepository.getEmployeeName(employee.last_name) == null)){
            return employeeRepository.addEmployee(employee)
        }
        else{

            return employeeRepository.printMessage(employee.last_name, employee.employeeId)
        }
    }

    fun deleteEmployee(employee: EmployeeDTO ): EmployeeDTO {
        return employeeRepository.deleteEmployee(employee)
    }

}