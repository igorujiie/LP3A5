package Optional.OfNullable;

import java.util.Optional;

public class OfNullable2 {
    public static void main(String[] args) {
        // create a Optional
        Optional<String> op2
                = Optional.ofNullable(null);

        // print value
        System.out.println("Optional 2: "
                + op2);
    }


}
