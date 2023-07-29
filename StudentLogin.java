public class StudentLogin {
    private String studentLogin;
    private String lastName;
    private String studentID;

    StudentLogin(String lastName, String studentID){
        this.lastName = lastName;
        this.studentID = studentID;
        studentLogin = this.lastName.substring(0,4) + this.studentID.substring(0,3);
    }

    public String generateLogin(){
        return studentLogin;
    }

    public void updateLogin(String newLastName){
        studentLogin = newLastName.substring(0,4) + studentID.substring(0,3);
    }
}
