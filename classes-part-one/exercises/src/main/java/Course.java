import java.util.ArrayList;

public class Course {
        private String title;
        private String description;
        private Teacher teacher;
        private ArrayList<Student> students;

// constructor
        public Course(String title, String description, Teacher teacher, ArrayList<Student> students) {
                this.title = title;
                this.description = description;
                this.teacher = teacher;
                this.students = students;
        }

        // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
        //  than just the class fields.
        public String toString() {
                return title + " (Description: " + description +
                        "\nTeacher: " + teacher + ", Students: " + getStudents() + ")";
        }

        // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
        //  Student objects equal.
        public boolean equals(Object toBeCompared) {
                if (toBeCompared == this) { return true; }
                if (toBeCompared == null) { return false; }
                if (toBeCompared.getClass() != getClass()) { return false; }
                Course theCourse = (Course) toBeCompared;
                return theCourse.getTitle() == getTitle();
        }



        //  getters and setters
        public String getTitle( ) {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescription( ) {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Teacher getTeacher( ) {
                return teacher;
        }

        public void setTeacher(Teacher teacher) {
                this.teacher = teacher;
        }

        public ArrayList<Student> getStudents( ) {
                return students;
        }

        public void setStudents(ArrayList<Student> students) {
                this.students = students;
        }
}
