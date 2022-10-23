package Optional.OrElseGet;

import java.util.Optional;

public class OrElseGet {
    public static void main(String[] args)
    {

        // create a Optional
        Optional<Integer> op
                = Optional.empty();

        // print supplier
        System.out.println("Optional: "
                + op);

        try {

            // orElseGet supplier
            System.out.println("Value by orElseGet"
                    + "(Supplier) method: "
                    + op.orElseGet(
                    () -> (int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
