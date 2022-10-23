package Optional.orElseThrow;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args)
    {

        // create a Optional
        Optional<Integer> op
                = Optional.of(9455);

        // print supplier
        System.out.println("Optional: "
                + op);

        // Optional.orElseThrow supplier
        System.out.println(
                "Value by Optional.orElseThrow("
                        + "ArithmeticException::new) method: "
                        + op.orElseThrow(
                        ArithmeticException::new));
    }
}
