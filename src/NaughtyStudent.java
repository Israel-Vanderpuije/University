public class NaughtyStudent extends Student{
    //
    @Override
    public String getStudentName() {
        return super.getStudentName();
    }

    @Override
    public void setStudentName(String studentName) {
        super.setStudentName(studentName);
    }

    @Override
    public int getStudentID() {
        return super.getStudentID();
    }

    @Override
    public void setStudentID(int studentID) {
        super.setStudentID(studentID);
    }

    @Override
    public studentYear getStudentYear() {
        return super.getStudentYear();
    }

    public NaughtyStudent(String studentName, int studentID, studentYear studentyear) {
        super(studentName, studentID, studentyear);
    }


}
