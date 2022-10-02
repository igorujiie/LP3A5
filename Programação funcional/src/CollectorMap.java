import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMap {
    public static void main(String[] args)
    {

        // Criando a String com chaves nao repitidas
        Stream<String[]> str = Stream.of(new String[][] { { "GFG", "GeeksForGeeks" },
                        { "g", "geeks" },
                        { "G", "Geeks" } });

        // Convertendo a String to Map
        // usando toMap()
        Map<String, String> map = str
                .collect(Collectors
                .toMap(p -> p[0], p -> p[1]));

        // imprimindo
        System.out.println("Map:" + map);
    }
}
