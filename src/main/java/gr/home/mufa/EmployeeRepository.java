package gr.home.mufa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
interface EmployeeRepository extends MongoRepository<Employee, String> {
    List<Employee> findByName(@Param("name") String name);
}
