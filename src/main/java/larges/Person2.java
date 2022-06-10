package larges;

import java.util.Set;

public class Person2 {
    String name;
    int age;
    Set<Person> friends;
    Address address;

    public Person2(String name, int age, String addressLine1, String addressLine2, String city, String state, String zipCode) {

    }

    public String getAddressString() {
        return address.getAddressString();
    }

    public void updateAddress(String addressLine1, String addressLine2, String city, String state, String zipCode) {
        address.updateAddress(addressLine1, addressLine2, city, state, zipCode);
    }

    public void getName() {

    }

    public void addFriend(Person p) {
        friends.add(p);
    }
}
