public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private Double yearsTeaching = 0.0;

        public Teacher(String aFirstName, String aLastName, String aSubject, Double aYrsTeaching) {
            this.firstName = aFirstName;
            this.lastName = aLastName;
            this.subject = aSubject;
            this.yearsTeaching = aYrsTeaching;
        }

        public Teacher(String aFirstName, String aLastName, String aSubject) {
            this.firstName = aFirstName;
            this.lastName = aLastName;
            this.subject = aSubject;
        }

        public String getFirstName( ) {
            return this.firstName;
        }

        private void setFirstName(String aFirstName) {
            this.firstName = aFirstName;
        }

        public String getLastName( ) {
            return this.lastName;
        }

        private void setLastName(String aLastName) {
            this.lastName = aLastName;
        }

        public String getSubject( ) {
            return this.subject;
        }

        private void setSubject(String aSubject) {
            this.subject = aSubject;
        }

        public Double getYearsTeaching( ) {
            return this.yearsTeaching;
        }

        private void setYearsTeaching(Double aYrsTeaching) {
            this.yearsTeaching = aYrsTeaching;
        }

        public String getFullName() {
            return this.firstName + " " + this.lastName;
        }

}
