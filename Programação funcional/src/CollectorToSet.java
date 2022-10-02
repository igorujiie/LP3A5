import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToSet {
    public static void main(String[] args)
    {

        // criandoa Stream of strings
        Stream<String> s = Stream.of("1", "2", "3", "4");

        // usando Collectors toSet() function
        Set<String> mySet = s.collect(Collectors.toSet());

        // imprimindo os elementos
        System.out.println(mySet);
    }
}
