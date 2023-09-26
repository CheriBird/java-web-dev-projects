import java.util.ArrayList;

public class Student {

        private static int nextStudentId = 1;
        private int studentId;
        private String name;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String aName, int aStudentId, int aNumCredits, double aGpa) {
                name = aName;
                studentId = aStudentId;
                numberOfCredits = aNumCredits;
                gpa = aGpa;
        }

        public Student(String aName, int aStudentId) {
                this(aName, aStudentId, 0, 0);
        }

        public Student(String aName) {
                this(aName, nextStudentId);
                nextStudentId++;
        }

        public String studentInfo() {
                return (this.name + " has a GPA of: " + this.gpa);
        }

        public void addGrade(int courseCredits, double grade) {
                // Update the appropriate fields: numberOfCredits, gpa
                this.numberOfCredits = this.numberOfCredits + courseCredits;
                // ????? this.gpa =
        }

        public String getGradeLevel() {
                // Determine the grade level of the student based on numberOfCredits
                return "";
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName( ) {
                return name;
        }

        public void setName(String aName) {
                name = aName;
        }

        public int getStudentId( ) {
                return studentId;
        }

        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }

        public int getNumberOfCredits( ) {
                return numberOfCredits;
        }

        private void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public double getGpa( ) {
                return gpa;
        }

        private void setGpa(double aGpa) {
                gpa = aGpa;
        }

}
