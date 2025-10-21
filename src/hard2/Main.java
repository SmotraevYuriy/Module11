package hard2;

import static hard2.Checker.valid;

public class Main {
    public static void main(String[] args) {

        String brackets1 = "[ { () } ]";
        String brackets2 = "[ [ { ] } ]";

        if (valid(brackets1)) {
            System.out.println(brackets1 + " — правильная");
        } else {
            System.out.println(brackets1 + " — неправильная");
        }
        if (valid(brackets2)) {
            System.out.println(brackets2 + " — правильная");
        } else {
            System.out.println(brackets2 + " — неправильная");
        }

    }
}
