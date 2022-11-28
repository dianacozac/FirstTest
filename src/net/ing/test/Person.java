package net.ing.test;

public class Person {

    public static String MALE = "M" ;
    public static String FEMALE = "F" ;
    public String firstName;
    public String lastName;
    private String address;

    public String address2;


    public Person() {
        this.firstName = "f";
        this.lastName = "l";
        this.address = "a";
    }
    public Person(String f, String l, String a) {
        this.firstName = f;
        this.lastName = l;
        this.address = a;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}


