package abstractClasses;

public class Student  extends Person{

    private String major;

    /**
     * n imie i nazwisko studenta
     * m specjalizacja studenta
     */
    public Student(String name, String major){

        //Przekazanie n do konstruktora nadklasy.

        super(name);
        this.major = major;
    }

    public String getDescription(){

        return "student specjalizacji " + major;
    }
}
