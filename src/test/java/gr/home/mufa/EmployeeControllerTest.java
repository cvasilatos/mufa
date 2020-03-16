package gr.home.mufa;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@DataMongoTest
public class EmployeeControllerTest {

//    @ClassRule
//    public static GenericContainer redis = new GenericContainer("mongo:3.2.4")
//                    .withExposedPorts(27017);
//
//    @BeforeEach
//    public void setUp() {
//        String address = redis.getContainerIpAddress();
//        Integer port = redis.getFirstMappedPort();
//
//        MongoCredential credential = new MongoCredential(address, port);
//        underTest = new MongoCredentialWithCache(credential);
//    }
//    @Autowired
//    private EmployeeController ec;

    @Autowired
    private MongoTemplate mt;

    @Autowired
    private EmployeeRepository er;

    @Test
    @DisplayName("Get validation")
    public void someTestMethod() {
        System.out.println("Test --- 2");
        Assertions.assertEquals(Optional.empty(), er.findById(1L));
    }

    @Test
    @DisplayName("Insertion validation")
    public void insertTestMethod() {
        Employee employee = new Employee("test", "admin");
        employee = mt.insert(employee);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        System.out.println("Test --- 2");
        Assertions.assertSame(employees, er.findByName("test"));
    }
}
