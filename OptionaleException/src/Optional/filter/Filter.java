package Optional.filter;

import java.util.Optional;

public class Filter {
    public static void main(String[] args)
    {

        // create a Optional
        Optional<Integer> op
                = Optional.of(9456);

        // print value
        System.out.println("Optional: "
                + op);

        // Optional.filter the value
        System.out.println("Filtered value "
                + "for odd or even: "
                + op
                .filter(num
                        -> num % 2 == 0));
    }
}
