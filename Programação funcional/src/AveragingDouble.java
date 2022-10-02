import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingDouble {
    public static void main(String[] args)
    {

        //criando Stream
        Stream<String> s = Stream.of("3", "4", "5");

        // usando  Collectors averagingDouble(ToDoubleFunction mapper)
        // method to find arithmetic mean of inputs given
        double ans = s
                .collect(Collectors
                        .averagingDouble(
                                num -> Double.parseDouble(num)));

        //imprimindo o resultado
        System.out.println(ans);
    }
}
