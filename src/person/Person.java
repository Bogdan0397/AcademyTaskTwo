package person;

/**
 * Created by koqfl on 24.04.2017.
 */
public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    Person(){

    }
    Person(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public String output(){
        return name+" "+birthYear+" ";


    }

    public static void main(String[] args) {
        Person person1 = new Person("1",1997);
        Person person2 = new Person("2",1998);
        Person person3 = new Person("3",1999);
        Person person4 = new Person("4",2000);
        Person person5 = new Person("5",2001);

        person1.input("02",2005);
        person2.input("03",2006);
        person3.input("04",2007);
        person4.input("05",2008);
        person5.input("06",2009);

        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());
    }
}
