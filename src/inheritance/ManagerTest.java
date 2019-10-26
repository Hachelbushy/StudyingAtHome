package inheritance;

public class ManagerTest {
    public static void main(String[] args) {

        //Tworzenie obiektu klasy Manager

        Manager boss = new Manager("Mateusz Zakrzewski",6500,2020,03,30);
        boss.setBonus(1500);

        Employee[] staff = new Employee[3];

        //Wstawianie obiektow klas Manager i Employee do tablicy staff

        staff[0] = boss;
        staff[1] = new Employee("Henryk Kwiatek", 4500, 2018,12,4);
        staff[2] = new Employee("Artur Kwiatkowski", 4800,2017,04,22);

        //Wyswietlanie informacji o wszystkich obiektach klasy Employee

        for(Employee e : staff)
            System.out.println("Nazwa pracownika: " + e.getName() + ", wynagrodzenie: " + e.getSalary() + " PLN");

    }
}
