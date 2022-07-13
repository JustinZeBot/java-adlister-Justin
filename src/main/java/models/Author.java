package models;


//CREATE TABLE authors (
//    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
//    first_name VARCHAR(50),
//    last_name  VARCHAR(100) NOT NULL,
//    PRIMARY KEY (id)
//);

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    public Author() {
    }

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public Author setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}

