package oop;

import java.time.LocalDate;

public class Student extends Person{
    private String faculty;
    private int graduateYear;

    public Student(String firstName, String lastName, LocalDate birthDate, String faculty, int graduateYear) {
        super(firstName, lastName, birthDate);

        this.faculty = faculty;
        this.graduateYear = graduateYear;

    }

    public String getFaculty(){
        return faculty;
    }

    public String setFaculty(){
        return faculty;
    }

    public int getGraduateYear(){
        return graduateYear;
    }

    public int setGraduateYear(){
        return graduateYear;
    }




}
