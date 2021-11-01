import java.util.*;

public class Course {

    private Lecturer lecturer;
    private List<Student> studentList = new ArrayList<>();
    enum courseYear {firstYearCourse, secondYearCourse, thirdYearCourse, fourthYearCourse}
    courseYear courseyear;

    // Generate getters and setters
    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    } // End of getters and setters

    public Course(Lecturer lecturer, List<Student> studentList, courseYear courseyear) {
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.courseyear = courseyear;
    }
}
