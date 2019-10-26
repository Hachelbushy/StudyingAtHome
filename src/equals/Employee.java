package equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){

        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);

    }
    public String getName(){

        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){

        double raise = salary * byPercent /100;
        salary += raise;
    }

    public boolean equals(Object otherObject){

        //Sprawdzanie, czy obiekty sa identyczne.
        if(this == otherObject)
            return true;

        //Musi zwracac false, jesli jawny parametr jest null.

        if(otherObject == null)
            return  false;

        //Jesli klasy nie zgadzaja sie, nie moga byc jednakowe.

        if(getClass() != otherObject.getClass())
            return false;

        //Teraz wiadomo, ze otherObject jest typu Employee i nie jest null.

        Employee other = (Employee) otherObject;

        //Sprawdzanie czy pola maja identyczne wartosci.

        return  Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.getHireDay());
    }

    public int hashCode(){

        return Objects.hash(name, salary, hireDay);

    }

    public  String toString(){

        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }

}
