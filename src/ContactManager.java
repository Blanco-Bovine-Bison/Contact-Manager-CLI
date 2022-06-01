import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ContactManager {
    public static void main(String[] args) throws IOException{

    }
    public static void addContact(Path path) throws IOException {
//        contacts.add(profile);
        Scanner scanner = new Scanner(System.in);
        Path contacts = Paths.get("src", "contacts.txt");

        System.out.println("Please enter the name of the Contact to add");
        String name = scanner.nextLine();
        System.out.println("Please enter the cell number of the Contact to add");
        String cell = scanner.nextLine();

        Contact newContact = new Contact(name, cell);

        Files.write(path, List.of(newContact.getName() + ", " + newContact.getCell()), StandardOpenOption.APPEND);
//        store contacts.text into a ArrayList variable using File.read...etc
//         convert Contact to ArrayList
//        add ArrayList contact to contacts.txt using .APPEND
//

    }
    public static void deleteContact() throws IOException{
        Scanner scanner = new Scanner(System.in);
        Path contacts = Paths.get("src", "contacts.txt");

        System.out.println("Please enter the name of the Contact to delete");
        String name = scanner.nextLine();
//        try catch method of reading through a file
        try {
            Scanner contactFinder = new Scanner(contacts);

            //now read the file line by line...
            int lineNum = 0;
            while (contactFinder.hasNextLine()) {
                String line = contactFinder.nextLine();
                lineNum++;
                if(line.toUpperCase().contains(name.toUpperCase())) {
                    System.out.println("deleting line " + lineNum + " entry for person " );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Files.read(contacts, StandardOpenOption.READ);
    }
//    public static List readAllContacts() {

//        return contacts;
//    }
//    method for reading and displaying all contacts adapted from https://www.codegrepper.com/code-examples/java/print+every+line+of+text+file+java

//    public static void writeAllContacts() {
//        ArrayList list =
//        ArrayList<Contact> contactList = new ArrayList<Contact>["Bob Ross", "999-9999-0000"];
//    }
//    public static List numberedSelection(int start, int end) {
//
//    }

//    public static List patialMatches(String cellOrNamePart) {
//
//    }
}
