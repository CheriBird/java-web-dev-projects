package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String topic;
    private String instructor;
    private int credits;

    public Course (String topic, String instructor) {
        this.topic = topic;
        this.instructor = instructor;
     }

    public Course (String topic, String instructor, int credits) {
        this.topic = topic;
        this.instructor = instructor;
        this.credits = credits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted
    //  String rather than just the class fields.
    @Override
    public String toString( ) {
        return "Course{" +
                "topic: '" + topic + '\'' +
                ", instructor: " + instructor +
                ", credits: " + credits +
                '}';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in
    //  order to call two Course objects equal.
    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass()) return false;
        Course course = (Course) toBeCompared;
        return credits == course.credits
            && Objects.equals(topic, course.topic)
            && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() { return Objects.hash(topic, instructor, credits); }

    public String getTopic() { return topic; }

    public void setTopic(String topic) { this.topic = topic; }

    public String getInstructor() { return instructor; }

    public void setInstructor(String instructor) { this.instructor = instructor; }

    public int getCredits() { return credits; }

    public void setCredits(int credits) { this.credits = credits; }

}
