package com.example.demo.model


import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class EmployeeDTO(var first_name: String, var last_name: String, var age: Int, @Id var employeeId: Int, var dateOfHire: LocalDate)

    {


        constructor() : this(
            "",
             "",
            0,
            1,
            LocalDate.now()
            )
    }







