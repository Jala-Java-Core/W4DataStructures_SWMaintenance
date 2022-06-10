package larges;

import java.util.Set;

public class Person {
    String name;
    int age;
    Set<Person> friends;
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipCode;

    public Person(String name, int age, String addressLine1, String addressLine2, String city, String state, String zipCode) {

    }

    public String getAddressString() {
    return "";
    }

    public void updateAddress(String addressLine1, String addressLine2, String city, String state, String zipCode) {

    }

    public void getName() {

    }

    public void addFriend(Person p) {
        friends.add(p);
    }
}
