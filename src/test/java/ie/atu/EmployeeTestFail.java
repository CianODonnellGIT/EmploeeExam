package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    @BeforeEach
    void setup(){
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Su", 1233444444);});
        assertEquals("This is not a valid name", exMessage);
    }

    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Blake", 1233);});
        assertEquals("This is not a valid id", exMessage);
    }

}