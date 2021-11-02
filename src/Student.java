import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    private int studentID;
    enum studentYear {firstYear, secondYear, thirdYear, fourthYear;}
    private studentYear studentyear;
    public static List<Student> allStudentList = new ArrayList<>();


    //Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public studentYear getStudentYear() {
        return studentyear;
    }


    // Constructor for Student class
    public Student(String studentName, int studentID, studentYear studentyear) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentyear = studentyear;

        allStudentList.add(new Student(studentName, studentID,studentyear));

    } //End of constructor for Student class

}
