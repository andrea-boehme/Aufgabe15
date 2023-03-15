import java.util.Objects;

public class Person extends Human{
    Integer age;
    String firstName;
    String lastName;

    Integer height;
    Integer weight;

    /**
     * constructor method used to initialize objects. It is called when an object of a class is created.
     * @param age
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Person(Integer age, String firstName, String lastName, Integer height, Integer weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    /**
     * equals and hashCode methods
     * An object hash code value can change in multiple executions of the same application.
     * If two objects are equal according to equals() method, then their hash code must be same.
     * If two objects are unequal according to equals() method, their hash code are not required to be different
     * @param o
     * @return true if persons are equal, or false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age.equals(person.age) && firstName.equals(person.firstName) && lastName.equals(person.lastName) && height.equals(person.height) && weight.equals(person.weight);
    }
    /*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
  }
     */

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, height, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

