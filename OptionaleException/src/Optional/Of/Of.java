package Optional.Of;

import java.util.*;
public class Of {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op
                = Optional.of(9455);

        // print value
        System.out.println("Optional: "
                + op);
    }
}
