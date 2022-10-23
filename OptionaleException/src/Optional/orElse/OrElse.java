package Optional.orElse;

import java.util.Optional;

public class OrElse {
    public static void main(String[] args)
    {

        // create a Optional
        Optional<Integer> op
                = Optional.empty();

        // print value
        System.out.println("Optional: "
                + op);

        try {

            // Optional.orElse value
            System.out.println("Value by Optional.orElse"
                    + "(100) method: "
                    + op.orElse(100));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
