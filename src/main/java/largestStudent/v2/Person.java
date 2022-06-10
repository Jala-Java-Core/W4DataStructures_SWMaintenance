package largestStudent.v2;

import largest.v2.Address;

import java.util.Date;

public class Person {
    //Code W4-5
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private Date birthdate;

    public Person(String firstName, String lastName, String email, Address address, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.birthdate = birthdate;
    }

    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }
}
