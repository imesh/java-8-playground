package imesh.io.java8.playground;

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

public class HelloConstructorReferences {

    public static void main(String[] args) {
        
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}