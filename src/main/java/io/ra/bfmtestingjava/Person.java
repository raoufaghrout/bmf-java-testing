package io.ra.bfmtestingjava;

public class Person {

    private final String firstName;
    private final String surname;
    private final int age;

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
