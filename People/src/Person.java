import java.util.OptionalInt;
public class Person {
    protected final String name;
    protected final String surname;
    protected final int age;
    protected final String city;
    //...

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        //...
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        //...
    }
    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        //...
    }
    public String getName() {
        return name;
        /*...*/ }
    public String getSurname() {

        return surname;
        /*...*/ }
    public OptionalInt getAge() {
        return age;
        /*...*/ }
    public String getAddress() {

        return city;
        /*...*/ }
    public PersonBuilder newChildBuilder() { /*...*/ }
    public boolean hasAge() {
        /*...*/ }
    public boolean hasAddress() { /*...*/ }
    public void setAddress(String city) { /*...*/ }
    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + (name != null ? name.hashCode() : 0);
        result = prime * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
