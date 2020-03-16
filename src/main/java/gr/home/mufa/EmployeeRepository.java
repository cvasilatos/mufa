package gr.home.mufa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.websocket.server.PathParam;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "find")
interface EmployeeRepository extends MongoRepository<Employee, Long> {
    List<Employee> findByName(@PathParam("name") String name);
}
