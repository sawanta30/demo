package com.example.demo.core.Interview.collctions;

public class Person {

    private String firstName;
    private String lastname;

    public Person(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Override
    public int hashCode(){
        return 13;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
