public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String dayOfBirth;
    private String email;
    private String address;

    public Person() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        dayOfBirth = "";
        email = "";
        address = "";
    }

    public Person(String newFirstName, String newLastName, String newPhoneNumber, String newDayOfBirth, String newEmail, String newAddress) {
        firstName = newFirstName;
        lastName = newLastName;
        phoneNumber = newPhoneNumber;
        dayOfBirth = newDayOfBirth;
        email = newEmail;
        address = newAddress;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setDayOfBirth(String newDayOfBirth) {
        dayOfBirth = newDayOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }
}
