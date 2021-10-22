public class Stories {
    public static int numberOfArrangements(int numberOfStories) {
        //large apartment takes 2
        //small apartment takes 1


        int allSmallApartmentArrangement = 1;

        int largeApartmentSpaceConsumption = 2;
        int smallApartmentSpaceConsumption = 1;

        //how many times can large apartment take up the total space.
        int noOfLargeApartments = numberOfStories / largeApartmentSpaceConsumption;
        int noOfPossibleSpaceTakenByLargeApartment = noOfLargeApartments * largeApartmentSpaceConsumption ;

        int noOfSpaceLeftTakenBySmallApartment = numberOfStories % noOfPossibleSpaceTakenByLargeApartment;

        //how many times can small apartment take up total space.
        System.out.println("no-Large-Apartment: " + noOfLargeApartments);
        System.out.println("no-Space-Taken-By-Large-Apartment: " + noOfPossibleSpaceTakenByLargeApartment);
        System.out.println("no-SpaceLeft-Apartment: " + noOfSpaceLeftTakenBySmallApartment);

        int no_of_possible_arrangements = permute(noOfLargeApartments + noOfSpaceLeftTakenBySmallApartment, 2);

        System.out.println("no_of_possible_arrangements: " + no_of_possible_arrangements);

        return no_of_possible_arrangements + allSmallApartmentArrangement;

    }

    public static java.math.BigInteger factorial(int num){
        int i;
        java.math.BigInteger fact = java.math.BigInteger.ONE;
        for(i = 1; i <= num; i++){
            fact = fact.multiply(java.math.BigInteger.valueOf(i));
        }

        return fact;
    }

    public static int permute(int num, int permutate){
        java.math.BigInteger val = factorial(num).divide(factorial(num - permutate));
        return (int)val.longValueExact();
    }

    public static void main(String[] args) {
        System.out.println(numberOfArrangements(1000));
    }
}