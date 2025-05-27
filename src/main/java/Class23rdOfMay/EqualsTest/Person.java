package Class23rdOfMay.EqualsTest;

public class Person {

    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
}

