package datastructures.prac;

public class DrillApp {
    public static void main(String[] args) {
        String encryptedFileDestination = "C:\\Users\\DELL PC\\Documents\\Ebooks\\Java How to Program By Dietel & Dietel (9th Edition).pdf.encrypted";
        encryptedFileDestination = encryptedFileDestination.replace(".encrypted", "").replace(".", "-Decrypted.");

        System.out.println(encryptedFileDestination);

        FunctionalTest functionalTest = new FunctionalTest(){
            public void doSomething(){
                System.out.println("Functional=>Test");
            }
        };

        functionalTest.doSomething();

        FunctionalTest newFunc = () -> {
            System.out.println("Functional Test Implementation");
        };

        newFunc.doSomething();

    }
}



@FunctionalInterface
interface FunctionalTest{
    void doSomething();
}
