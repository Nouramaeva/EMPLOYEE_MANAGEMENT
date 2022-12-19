package com.example.demo.repositories

import com.example.demo.model.EmployeeDTO
import org.springframework.stereotype.Repository
import java.util.*


@Repository
class EmployeeRepository(private val employee_Db: MutableList<EmployeeDTO> ) {

    //GET
    fun fetchEmployees(): List<EmployeeDTO>{
        return employee_Db
    }


    fun getEmployeeById(id: Int): EmployeeDTO? {
        return employee_Db.find { it.employeeId == id }
    }

    fun printMessage(name: String, id: Int): String? {
        return "Employee " + name + " with ID " + id + " already exists."
    }

    fun getEmployeeName(name: String): EmployeeDTO? {
        return employee_Db.find { it.last_name == name }
    }

    //POST
    fun addEmployee(employee: EmployeeDTO): EmployeeDTO{
        employee_Db.add(employee)
        return employee
    }

    //DELETE
    fun deleteEmployee(employee: EmployeeDTO): EmployeeDTO{
        employee_Db.remove(employee)
        return employee
    }

}