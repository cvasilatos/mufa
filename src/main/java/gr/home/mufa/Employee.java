package gr.home.mufa;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
class Employee {

    private @Id String id;
    private String name;
    private String role;

    public Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
