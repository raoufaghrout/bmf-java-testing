package io.ra.testingjava;

public class Person {

    private String firstName;
    private String surname;
    private int age;

    public Person() {}

    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
