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
