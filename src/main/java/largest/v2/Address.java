package largest.v2;

public class Address {

    //Code W4-4
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipCode;

    public Address( String addressLine1, String addressLine2, String city, String state, String zipCode) {
        addressLine1 = addressLine1;
        addressLine2 = addressLine2;
        city = city;
        state = state;
        zipCode = zipCode;
    }

    public String getAddressString() {
        return null;
    }

    public void updateAddress(String addressLine1, String addressLine2, String city, String state, String zipCode) {
        addressLine1 = addressLine1;
        addressLine2 = addressLine2;
        city = city;
        state = state;
        zipCode = zipCode;
    }

}
