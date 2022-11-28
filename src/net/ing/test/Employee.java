package net.ing.test;

public class Employee extends Person {
    private int salary ;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setAddress2 ( String arg) {
        this.address2 = arg ;
    }
}
