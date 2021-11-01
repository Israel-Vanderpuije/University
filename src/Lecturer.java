public class Lecturer {

    private String lecturerName;
    enum lecturerCourse {englishLanguage, Maths, Physics, Programming, Gardening}
    lecturerCourse lecturercourse;

    // Generating setters and getters
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public lecturerCourse getLecturercourse() {
        return lecturercourse;
    }

    public void setLecturercourse(lecturerCourse lecturercourse) {
        this.lecturercourse = lecturercourse;
    } // End of setters and getters


    // Constructor for lecturer class
    public Lecturer(String lecturerName, lecturerCourse lecturercourse) {
        this.lecturerName = lecturerName;
        this.lecturercourse = lecturercourse;
    } // End of constructor for lecturer class

}
