package oop;

import java.time.LocalDate;

public abstract class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    public String getFirstName() {
        return firstName;
    }
    public String setFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String setLastName() {
        return lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public LocalDate setBirthDate() {
        return birthDate;
    }
}
