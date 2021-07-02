package java8;

import java.util.Date;

public class Users {
    private String firstName;
    private String lastName;
    //private Date yearOfBirth;
    private String yearOfBirth;

    public Users(String firstName, String lastName, String yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + " " + yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

}
