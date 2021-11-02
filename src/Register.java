import java.util.List;

public class Register {

    List<String>namesOfAllStudents;

    // Get all the names of students
    public List<String> getRegister(List<Student> allStudentList){
        for ( Student s: allStudentList){
            namesOfAllStudents.add(s.getStudentName());
        }
        return namesOfAllStudents;
    }

    public Register(List<String> namesOfAllStudents) {
        this.namesOfAllStudents = namesOfAllStudents;
    }
}
