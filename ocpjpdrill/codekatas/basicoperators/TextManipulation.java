package codekatas.basicoperators;

public class TextManipulation {
    public static void main(String[] args) {
        experimentStringBuilder();
    }

    private static void experimentStringBuilder() {
        StringBuilder dataString = new StringBuilder(3);
        dataString.append('A');
        dataString.append('B');
        dataString.append('C');
        System.out.println("DataString: " + dataString);
        System.out.println("Capacity: " + dataString.capacity());
        dataString.setLength(2);
        System.out.println("After Updating Length of dataString: " + dataString);
        System.out.println("Capacity: " + dataString.capacity());
        dataString.ensureCapacity(4);
        System.out.println("Capacity: " + dataString.capacity());
        dataString.setLength(7);
        System.out.println("After Updating Length: " + dataString);
        System.out.println("Capacity: " + dataString.capacity());
        dataString.delete(1, 5);
        System.out.println("dataString = " + dataString);
        dataString.insert(2, "L");
        System.out.println("dataString (Inserting L) = " + dataString);
        dataString.insert(0, "LJK", 0, 2);
        System.out.println("Updated-DataString: " + dataString);

        String string = dataString.toString();


    }
}
