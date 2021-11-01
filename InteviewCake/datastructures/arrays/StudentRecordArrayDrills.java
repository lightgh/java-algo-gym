package datastructures.arrays;

public class StudentRecordArrayDrills {
    public static void main(String[] args) {
        // 30 Students - 0 => 29 ( for the 30 Students )
        // 6 courses - 0 => 5 ( for the 6 courses )
        int numberOfStudent = 30;
        int numberOfCourses = 6;

        int[][] studentRecords = new int[numberOfStudent][numberOfCourses];

        System.out.println("Showing Students Records: ");
        for (int e = 0; e < studentRecords.length; e++ ){

            System.out.println("Student " + (e + 1) + " Records ");
            for ( int f = 0; f < studentRecords[e].length; f++ ){
                System.out.println("Courses " + (f + 1) + " Score: " + studentRecords[e][f]);
            }
            System.out.println("--------------------------");
        }

    }
}
