import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorToList {
    public static void main(String[] args)
    {
        // criando a Stream of strings
        Stream<String> s = Stream.of("Geeks",
                "for",
                "GeeksforGeeks",
                "Geeks Classes");

        // usando Collectors toList() function
        List<String> myList = s.collect(Collectors.toList());

        //imprimindo os elementos
        System.out.println(myList);





    }
}
