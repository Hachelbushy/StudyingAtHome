package arrayList;


import inheritance.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        //Wstawianie do listy staff trzech obiektów klasy Employee.

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Karol Krakowski", 3400,2014,9,01));
        staff.add(new Employee("Dawid Imbiorski",6000,2013,11,01));
        staff.add(new Employee("Waldemar Kowalki",5500,1999,5,05));

        //Zwiekszenie pensji wszystkich pracownikow o 5%

        for(Employee employee : staff)
            employee.reiseSalary(5);

        //Drukowanie informacji o wszytkich obiektach Employee.

        for(Employee employee : staff)
            System.out.println("nazwa pracownika: " + employee.getName() + ",wysokosc wynagordzenia: " + employee.getSalary()
            + ",data zatrudnienia: " + employee.getHireDay());
        System.out.println("Ilosc osob zapisanych w tablicy: " + staff.size());
    }
}
