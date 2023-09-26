import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        int newID;

        do {    // Take in student names and ID numbers (as integers).
            // student IDs could be auto-generated
            System.out.println("Enter student name (or ENTER to finish):");
            newStudent = input.nextLine();
            if (!newStudent.isEmpty()) {
                System.out.println("Enter the ID for " + newStudent + ":");
                newID = Integer.parseInt(input.nextLine());
                students.put(newID, newStudent);    // Keys: IDs and Values: names.
            }
        } while (!newStudent.isEmpty());

        // Print roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
        // student count could be displayed
        System.out.println("Class size: " + students.size());

        input.close();

    }
}
