package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits
        if (credits >= 90) {
            return "Senior";
        } else if (credits >= 60) {
            return "Junior";
        } else if (credits >= 30) {
            return "Sophomore";
        } else if (credits >= 0) {
            return "Freshman";
        } else {
            return "Check enrollment. Credits are less than zero.";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString() {
            return this.name +
                " (Credits: " + this.getNumberOfCredits() + ", GPA: " + this.getGpa() + ")";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) return true;
        if (toBeCompared == null) return false;
        if (toBeCompared.getClass() != this.getClass()) return false;
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == this.getStudentId();
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(2, 3.5);
        System.out.println(sally);
        sally.addGrade(5, 3.8);
        System.out.println(sally);

        Teacher newTeacher = new Teacher("Kavin", "Master", "Web Dev", 5);
        System.out.println("\n*** Teacher *** \nName: "
            + newTeacher.getFirstName() + " " + newTeacher.getLastName()
            + "\nSubject: " + newTeacher.getSubject()
            + "\nYears Taught: " + newTeacher.getYearsTeaching());
        Course newCourse =
            new Course("Web Dev 101",
                newTeacher.getFirstName() + " " +
                newTeacher.getLastName(), 3);
        System.out.println("\n*** Course *** \nTitle: " + newCourse.getTopic()
            + "\nInstructor: " + newCourse.getInstructor()
            + "\nCredits: " + newCourse.getCredits());
    }
}