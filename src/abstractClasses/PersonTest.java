package abstractClasses;

public class PersonTest {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        //Wstawienia do tablicy people obiektow Student i Employee.

        people[0] = new Employee("Henryk Kwiatek", 4500,2018,11,21);
        people[1] = new Student("Marta Mrozowska", "informatyka");
        for(Person person : people)
            System.out.println(person.getName() + ". " + person.getDescription());
    }
}
