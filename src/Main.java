import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating new students
        Student student1 = new Student("Alice", 101, Student.studentYear.firstYear);
        Student student2 = new Student("Eben", 102, Student.studentYear.firstYear);
        Student student3 = new Student("Alfred", 103, Student.studentYear.secondYear);
        Student student4 = new Student("Jessica", 104, Student.studentYear.secondYear);
        Student student5 = new Student("Oscar", 105, Student.studentYear.thirdYear);
        Student student6 = new Student("Sandra", 106, Student.studentYear.thirdYear);
        Student student7 = new Student("Tei", 107, Student.studentYear.fourthYear);
        Student student8 = new Student("Seda", 108, Student.studentYear.fourthYear);

        System.out.println(student1.getStudentName() + " " + student1.getStudentID() + " " + student1.getStudentYear());

        // create new lecturer
        Lecturer lecturer1 = new Lecturer("Zedikus", Lecturer.lecturerCourse.Programming);

        //create new list for first years
        List<Student> firstYearStudentList = new ArrayList<>();
        firstYearStudentList.add(student1);
        firstYearStudentList.add(student2);


        // Advanced Gardening class for fourth years but also add third years to it
        List<Student> GardeningStudentList = new ArrayList<>();
        for(Student s: Student.allStudentList){
            if (s.getStudentYear() == Student.studentYear.thirdYear){
                GardeningStudentList.add(s);
            }
        }
        Course AdvancedGardening = new Course(lecturer1, GardeningStudentList, Course.courseYear.fourthYearCourse);

        // IntroToProgramming course for all first years
        Course IntroToProgramming = new Course(lecturer1, firstYearStudentList, Course.courseYear.firstYearCourse);

    }
}
