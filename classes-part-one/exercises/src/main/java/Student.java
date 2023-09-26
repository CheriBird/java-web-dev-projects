import java.util.ArrayList;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

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

        public void setGpa(double aGpa) {
                gpa = aGpa;
        }

        Student student = new Student ("Cheri", 111, 1, 4.0);

        public class Course {
                private String courseTitle;
                private String courseDesc;
                private String teacher;
                private ArrayList<Student> students;
        }

        public class Teacher {
                private String firstName;
                private String lastName;
                private String subject;
                private Double yearsTeaching = 0.0;

                public Teacher(String aFirstName, String aLastName, String aSubject, Double aYrsTeaching) {
                        firstName = aFirstName;
                        lastName = aLastName;
                        subject = aSubject;
                        yearsTeaching = aYrsTeaching;
                }

                public Teacher(String aFirstName, String aLastName, String aSubject) {
                        firstName = aFirstName;
                        lastName = aLastName;
                        subject = aSubject;
                        yearsTeaching = 0.0;
                }

                public String getFirstName( ) {
                        return firstName;
                }

                private void setFirstName(String aFirstName) {
                        firstName = aFirstName;
                }

                public String getLastName( ) {
                        return lastName;
                }

                private void setLastName(String aLastName) {
                        lastName = aLastName;
                }

                public String getSubject( ) {
                        return subject;
                }

                private void setSubject(String aSubject) {
                        subject = aSubject;
                }

                public Double getYearsTeaching( ) {
                        return yearsTeaching;
                }

                private void setYearsTeaching(Double aYrsTeaching) {
                        yearsTeaching = aYrsTeaching;
                }

                public String getFullName() {
                        return firstName + " " + lastName;
                }
        }
}
