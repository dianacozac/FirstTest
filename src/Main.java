import net.ing.test.Person;
import net.ing.test.Employee;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println("first argument is:" + args[0]);
//        System.out.println("second argument is:" + args[1]);
        System.out.println( "numarul de argumente este:" + args.length);
//        for (int i=0; i<=args.length; i++) {
//            System.out.println( "argumentul cu indexul " + i + " este " + args[i]);
//        }

        Person person = new Person( "Dana" , "Popescu" , "adresa1" ) ;
        Employee employee = new Employee(  ) ;
        employee.setSalary( 1200 );

        System.out.println( "Am creat obiectul person " + person.firstName +  " " + person.lastName + " " + person.getAddress() );
        System.out.println( "Am creat obiectul employee " + employee.firstName
                + " " + employee.lastName + " " + employee.getAddress() + " with salary: "  + employee.getSalary() );
//        System.out.println( employee.);
    }
}