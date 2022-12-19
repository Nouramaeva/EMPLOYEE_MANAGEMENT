package com.example.demo.model

import java.time.LocalDate
import java.util.Date

data class EmployeeDTO(val first_name: String, val last_name: String, val age: Int, val employeeId: Int,
                    val dateOfHire: LocalDate
)

