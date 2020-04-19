package gr.home.mufa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@DataMongoTest
public class EmployeeControllerTest {

    @Autowired
    private MongoTemplate mt;

    @Autowired
    private EmployeeRepository er;

    @Test
    @DisplayName("Insertion validation")
    public void insertTest() {
        Employee employee = new Employee("test", "admin");
        employee = mt.insert(employee);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        System.out.println("Test --- 2");
        Assertions.assertEquals(employees.size(), er.findByName("test").size());
    }

    @Test
    @DisplayName("Get validation")
    public void someTest() {
        System.out.println("Test --- 2");
        Assertions.assertEquals(Optional.empty(), this.er.findById("5e6fa11a54055b4b24db2e7c"));
    }

}
