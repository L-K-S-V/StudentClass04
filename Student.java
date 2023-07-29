/**
 * A Student class containing student name, ID and related functions
 * @author (Lukas Vegys)
 * @version (2023-07-23)
 */

public class Student
{
    private Name studentName;
    private StudentNumber studentID;
    private StudentLogin studentLogin;
    private int studentCredits;

    public Student(String firstName, String middleName, String lastName, int entryYear)
    {
        studentName = new Name(firstName, middleName, lastName);
        studentID = new StudentNumber(entryYear);
        studentLogin = new StudentLogin(studentName.getName("last name"),studentID.studentId());
        studentCredits = 0;
    }


    // *********************************
    // *** Interface with Name class ***
    // *********************************

    public String getFirstName(){
        return studentName.getName("first name");
    }

    public String getMiddleName(){
        return studentName.getName("middle name");
    }

    public String getLastName(){
        return studentName.getName("last name");
    }

    public String getFullName(){
        return studentName.getName("full name");
    }

    public void changeFirstName(String newFirstName){
        studentName.changeName("first name", newFirstName);
    }

    public void changeMiddleName(String newMiddleName){
        studentName.changeName("middle name", newMiddleName);
    }

    public void changeLastName(String newLastName){
        studentName.changeName("last name", newLastName);
        studentLogin.updateLogin(newLastName);
    }


    // ***********************************************
    // *** Interface with StudentNumber (ID) class ***
    // ***********************************************

    public int getEntryYear(){
        return studentID.studentEntryYear();
    }

    public String getStudentID(){
        return studentID.studentId();
    }


    // *****************************************
    // *** Interface with StudentLogin class ***
    // *****************************************

    public String getStudentLogin(){
        return studentLogin.generateLogin();
    }


    // *******************
    // *** Own methods ***
    // *******************

    public int getStudentCredits() {
        return studentCredits;
    }

    public void addCredits(int additionalPoints) {
        studentCredits = studentCredits + additionalPoints;
    }

    public void printStudentInfo() {
        System.out.println("********************************************");
        System.out.println("Student Name:    " + studentName.getName("full name"));
        System.out.println("Year of entry:   " + studentID.studentEntryYear());
        System.out.println("Student ID:      " + studentID.studentId());
        System.out.println("Student Login:   " + studentLogin.generateLogin());
        System.out.println("Student Credits: " + studentCredits);
        System.out.println("********************************************");
    }
}
