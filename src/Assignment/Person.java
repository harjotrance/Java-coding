package Assignment;

import java.util.Objects;

abstract public class Person {

    protected String name;
    protected String address;
    protected int age;
    protected String DOB;
    protected static int Id ;


    public Person(String name, String address, Integer age, String DOB, Integer Id) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.DOB = DOB;
        this.Id = Id;

    }

    static void Speak() {
        System.out.println("A person is speaking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
