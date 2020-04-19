package gr.home.mufa;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "mufa")
class Employee {

    @MongoId(FieldType.OBJECT_ID) String id;
    private String name;
    private String role;

    public Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
