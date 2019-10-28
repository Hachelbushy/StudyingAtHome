package interfaces;



import java.util.Arrays;

/**
 * Ten program demonstruje sposób użycia interfejsu Comparable.
 * @version 1.1 28.11.2019
 * @author Mateusz Zakrzewski
 */

public class EmployeeSortTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Henryk Kwiatek",4500);
        staff[1] = new Employee("Arkadiusz Gwizd",7690);
        staff[2] = new Employee("Jakub Kierszk", 6600);

        Arrays.sort(staff);

        //Drukowanie informacji o wsyzstkich obiektach klasy Emplyee

        for(Employee e : staff)
            System.out.println("nazwa pracownika: " +e.getName() + "wynagrodzenia pracownika: " + e.getSalary());
    }
}
