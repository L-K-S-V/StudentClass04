// It must be a numeric string consisting of 8 digits. The first two digits are the year of entry into the University.
// It is up to you to decide what services your class will provide, but at the very least is must be able to return
// the full id and to return the year of entry.

public class StudentNumber {
    private int entryYear; // two digit format e.g. 23
    private static int idNumber = 123456; // incrementing ID number starting from 123456
    private String studentID;

    StudentNumber(int entryYear){
        this.entryYear = entryYear;
        studentID = String.valueOf(entryYear) + String.valueOf(idNumber);
        idNumber += 1; // increment student ID by 1, because we're all unique numbers!
    }

    public int studentEntryYear(){
        return entryYear;
    }

    public String studentId(){
        return studentID;
    }
}
