import java.util.List;

public class Main {

    // Shallow copies duplicate as little as possible.
    // A shallow copy of a collection is a copy of the collection structure, not the elements.
    // With a shallow copy, two collections now share the individual elements.
    //
    //Deep copies duplicate everything.
    // A deep copy of a collection is two collections with all the elements in the original collection duplicated.
    public static void main(String[] args) {

        Person p1 = new Person(18, "Anna", "Klein", 150, 50); // neues Person Objekt erstellt.
        Human h1 = new Human(); // neues Human Objekt erstellt.

        List listOne = ShallowCopier.createShallowCopy(p1, 10); // Methode aufgerufen welche die Liste zurückgibt und Ergebnis in "list" vom Typ Liste gespeichert.
        System.out.println(listOne.size());                                     // bei Listen wird ".size" statt ".length" verwendet.

        List<Human> listTwo = ShallowCopier.genericCreateShallowCopy(h1, 10);
        System.out.println(listTwo.size());

        List<Person> listThree = ShallowCopier.genericCreateShallowCopy(p1, 10);
        System.out.println(listThree.size());
    }
}