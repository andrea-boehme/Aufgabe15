import java.util.List;

public class Main {

    // Shallow copies duplicate as little as possible.
    // A shallow copy of a collection is a copy of the collection structure, not the elements.
    // With a shallow copy, two collections now share the individual elements.
    //
    //Deep copies duplicate everything.
    // A deep copy of a collection is two collections with all of the elements in the original collection duplicated.
    public static void main(String[] args) {

        Person p1 = new Person(18, "Anna", "Klein", 150, 50);
        Human h1 = new Human();

        List list = ShallowCopy.createShallowCopy(p1, 10);
        System.out.println(list.size());

        List<Human> listTwo = ShallowCopy.genericCreateShallowCopy(h1, 10);
        System.out.println(listTwo.size());

        List<Person> listThree = ShallowCopy.genericCreateShallowCopy(p1, 10);
        System.out.println(listThree.size());
    }
}