package com.example.demo.Configuration
import com.example.demo.model.EmployeeDTO
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    fun getFakeDb() : MutableList<EmployeeDTO> {
        return mutableListOf<EmployeeDTO>()
    }

}

