package gr.home.mufa;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.GenericContainer;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SomeTest {

    @ClassRule
    public static GenericContainer redis = new GenericContainer("mongo:latest")
                    .withExposedPorts(27017);

    @Autowired
    private EmployeeController ec;

    @Test
    public void someTestMethod(@Autowired MongoTemplate mongoTemplate) {
        mongoTemplate.findAll(Employee.class);
        System.out.println("LALALALALALALA");
        assert (true);
    }
}
