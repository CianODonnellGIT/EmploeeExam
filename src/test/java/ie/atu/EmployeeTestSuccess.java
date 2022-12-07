package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestSuccess {

    private Employee employee;

    @BeforeEach
        void setup(){
        employee = new Employee("Cian", 123456789);
    }

    @Test
    void employeeNamePass(){
        assertEquals("Tadhg", employee.getName());
    }

    @Test
    void employeeIdPass(){
        assertEquals(123456778, employee.getId());
    }
}