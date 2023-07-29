// The name attribute of Student will now have type Name rather than type String.
// The work will involve you in first implementing a Name class and then modifying the Student class to use Name.

// A student’s full name can consist of a first name, possibly a second name, and a last name.
// The class you are to produce should allow its clients to get the value of each name singly, also get the full name.
// Additionally, it must be possible to individually set each of the three component names.

// equivalent of an associated array/python dictionary
import java.util.HashMap;

public class Name {

    private HashMap<String, String> studentName = new HashMap<String, String>();

    Name(String firstName, String middleName, String lastName) {
        // Add keys and values
        studentName.put("first name", firstName);
        studentName.put("middle name", middleName);
        studentName.put("last name", lastName);
    }

    public String getName(String name) {
        return switch (name) {
            case "full name" -> studentName.get("first name") + " " + studentName.get("middle name") + " " + studentName.get("last name");
            case "first name" -> studentName.get("first name");
            case "middle name" -> studentName.get("middle name");
            case "last name" -> studentName.get("last name");
            default -> "no student found";
        };
    }

    public void changeName(String changeName, String newName) {
        studentName.put(changeName, newName);
    }


}


