import java.util.*;


public class ShallowCopy {

    public static List<Person> createShallowCopy(Person person, int numberOfCopies) {
        List<Person> list = new ArrayList<>();
        for(int i = 0; i < numberOfCopies; i++) {
            list.add(person);
            //System.out.println(person);
        }
        return list;
    }

    public static <T extends Human> List<T> genericCreateShallowCopy(T o, int numberOfCopies) {
        List<T> list = new ArrayList<>();
        for(int i = 0; i < numberOfCopies; i++) {
            list.add(o);
            //System.out.println(o);
        }
        return list;
    }

    }