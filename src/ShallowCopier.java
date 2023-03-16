import java.util.*;


/**
 * class to copy object; first method to copy Person object, second to copy any object that extends from Human object
 */

public class ShallowCopier <T>{

    // statische Methode die eine Liste aus Objekt Person erstellt
    /**
     * method to copy Person object
     * @param person
     * @param numberOfCopies number of elements in the list
     * @return List with Person objects
     */
    public static List<Person> createShallowCopy(Person person, int numberOfCopies) {
        List<Person> list = new ArrayList<>(); // neue Liste erstellen die Person Objekte enthalten wird.
        for(int i = 0; i < numberOfCopies; i++) { // Anzahl der Elemente in der Liste (Personen Objekte) = numberOfCopies.
            list.add(person);                       // Einzelne Person Objekte in die Liste einfügen.
            //System.out.println(person);
        }
        return list;
    }

    // statische Methode die eine Liste aus generischen Objekten (alle die von Human abstammen) erstellt.

    /**
     * method to copy any object that extends from Human object
     * @param objectToCopy any object that extends from Human object
     * @param numberOfCopies number of elements in the list
     * @return List with objects
     * @param <T> Person or subclass of Person (class that extends from Human object)
     */
    public static <T extends Human> List<T> genericCreateShallowCopy(T objectToCopy, int numberOfCopies) {
        List<T> copies = new ArrayList<>();
        for(int i = 0; i < numberOfCopies; i++) {
            copies.add(objectToCopy);
            //System.out.println(o);
        }
        return copies;
    }
}