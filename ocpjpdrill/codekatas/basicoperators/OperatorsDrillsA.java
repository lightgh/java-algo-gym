package codekatas.basicoperators;

public class OperatorsDrillsA {
    public static void main(String[] args) {
        var i = 67;
        System.out.println("Operator=> " + (i));
        System.out.println("Operator-Pre-Increment=> " + (++i));
        System.out.println("Operator-Pre Decrement=> " + (--i));
        System.out.println("Operator-Post DecrementPost=> " + (i--));

        //Checking --i-- // compile error because -- requires a variable not a value
//        System.out.println("Operator-DecrementPost=> " + (--i--));
//        System.out.println("Operator-DecrementPost=> " + (8--)); // similar to this.. //requires variable


        System.out.printf("PostIncrement-Before: %s (i++)==> Outcome: %s", i, (i++));
        System.out.printf("\nPostDecrement-Before: %s (i--)==> Outcome: %s", i, (i--));
        System.out.printf("\nPostDecrement-Before: %s (+i)==> Outcome: %s", i, (+i));
        System.out.printf("\nBefore: %s (-i)==> Outcome: %s", i, (-i));
        System.out.printf("\nBefore: %s (~i)==> Outcome: %s", i, (~i));
//        System.out.printf("\nBefore: %s (!i)==> Outcome: %s", i, (!(i));
        System.out.printf("\nBefore: %s (~-i)==> Outcome: %s", i, (~-i));
        System.out.printf("\nBefore: %s (-~i)==> Outcome: %s", i, (-~i));
        System.out.printf("\nBefore: %s (~i)==> Outcome: %s", i, (~i));
        i = 54;
        System.out.printf("\nBefore: %s (~i)==> Outcome: %s", i, (~i));
        i = 1;
        System.out.printf("\nBefore: %s (~i)==> Outcome: %s", i, (~i));
//        System.out.println("PostDecrement (i--)==> " + (i--));
        i = 12;
//        System.out.printf("\nBefore: %s (<<i)==> Outcome: %s", i, ( i ));
        System.out.printf("\nBefore: %s (i & i)==> Outcome: %s", i, ( i & i ));
        System.out.printf("\nBefore: %s (i | i)==> Outcome: %s", i, ( i | i ));
        boolean ij = true;
        System.out.printf("\nBefore: %s (ij || ij)==> Outcome: %s", ij, ( ij || ij ));
        System.out.printf("\nBefore: %s (ij && ij)==> Outcome: %s", ij, ( ij && ij ));
    }
}
