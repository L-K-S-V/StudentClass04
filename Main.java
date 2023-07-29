import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Testing integration of the Name class within the Student class.
        System.out.println("**************************");
        Student student001 = new Student("Rob", "John Arthur", "Halford", 21);
        System.out.println(student001.getStudentCredits());
        System.out.println(student001.getFirstName());
        System.out.println(student001.getMiddleName());
        System.out.println(student001.getLastName());
        System.out.println(student001.getFullName());
        System.out.println("**************************");
        System.out.println();

        student001.printStudentInfo();

        System.out.println();
        // Testing incrementation of student IDs
        Student student002 = new Student("David", "Scott", "Mustaine", 18);
        student002.addCredits(25);
        student002.printStudentInfo();

        System.out.println();
        // Testing incrementation of student IDs
        Student student003 = new Student("James", "Alan", "Hetfield", 12);
        student003.printStudentInfo();

        System.out.println();
        // Testing name changing
        student003.changeFirstName("Robin");
        student003.changeLastName("Stills");
        student003.printStudentInfo();

    }
}
