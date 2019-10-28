package interfaces;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String n, double s){

        this.name = n;
        this.salary = s;
    }

    public String getName(){

        return name;
    }

     public double getSalary(){

        return salary;
     }

     public void raiseSalary(double byPercent){

        double raise = salary * byPercent /100;
        salary += raise;
     }
    /**
     * Porównuje pracowników według wysokości pensji.
     * @param other inny obiekt klasy Employee
     * @return wartość ujemna, jeśli pracownik ma niższą pensję niż inny (other) pracownik,
     * 0, jeśli pensje są równe, w przeciwnym razie liczba dodatnia
     */

    public  int compareTo(Employee other){

        return Double.compare(salary, other.salary);
    }

}
