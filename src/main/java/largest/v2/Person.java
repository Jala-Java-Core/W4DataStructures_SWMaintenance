package largest.v2;

import java.util.Set;

public class Person {
    //Code W4-4
    String name;
    int age;
    Set<largest.Person> friends;
    Address address;

    public Person(String name, int age, String addressLine1, String addressLine2, String city, String state, String zipCode) {

    }

    public String getAddressString() {
        return address.getAddressString();
    }

    public void updateAddress(String addressLine1, String addressLine2, String city, String state, String zipCode) {
        address.updateAddress(addressLine1, addressLine2, city, state, zipCode);
    }

    public void getName() {

    }

    public void addFriend(largest.Person p) {
        friends.add(p);
    }
}
