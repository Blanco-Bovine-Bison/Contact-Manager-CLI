import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.*;

import static java.nio.file.Files.*;
import static java.nio.file.Files.createFile;

public class ContactManager {
    public static void main(String[] args) throws Exception {
        addContact();
    }

    public static void addContact() throws Exception {
//        contacts.add(profile);
        Scanner scanner = new Scanner(System.in);
        Path contacts = Paths.get("src", "contacts.txt");

        System.out.println("Please enter the name of the Contact to add");
        String name = scanner.nextLine();
        System.out.println("Please enter the cell number of the Contact to add");
        String cell = scanner.nextLine();

        Contact newContact = new Contact(name, cell);

        write(contacts, List.of(newContact.getName() + " || " + newContact.getCell()), StandardOpenOption.APPEND);
//        store contacts.text into a ArrayList variable using File.read...etc
//         convert Contact to ArrayList
//        add ArrayList contact to contacts.txt using .APPEND
//
    }

    public static void searchFile() throws Exception {
        // this ArrayList is adapted from https://stackoverflow.com/questions/5343689/java-reading-a-file-into-an-arraylist -JP
        //We are creating a new array list using a scanner object that searches the file given in the file path input.
        // "Sout"ing input prompt and created a new scanner to pull in information.
        // grab the user input using the scanner and store it in a string variable
        // iterate through each element in the arraylist codex and
        // see if that element matches the user input we stored earlier using a conditional statement
        // if it matches, system.out.println(result)
        // if it doesn't match, continue through the for each loop until a match is found
        //. The function is void because we are just printing to the console

        Scanner s = new Scanner(new File("filepath"));
        ArrayList<String> codex = new ArrayList<String>();
        while (s.hasNextLine()){
            codex.add(s.nextLine());
        }
        s.close();
        System.out.println("Please provide a Name and/or Number to search our database.");
        Scanner scanner = new Scanner(System.in);
        String searchInput = scanner.nextLine();

            // scan through database,

        for (String arrayElement: codex) {

            // if searchInput matches arrayElement

        if (arrayElement == searchInput)   {

            // and return those elements.

            System.out.println(arrayElement);
        }




        }
    }

//    public static void deleteContact() throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        Path contacts = Paths.get("src", "contacts.txt");
//        System.out.println("Please enter the full name of the Contact to delete");
//        String name = scanner.nextLine();
//        File contactFinder = new File(String.valueOf(contacts));
//        Scanner contactList = new Scanner(contactFinder);
//        ArrayList<String> list = new ArrayList<>();
////        try catch method of reading through a file
//        while (contactList.hasNextLine()) {
//            try {
//                int lineNum = 0;
//                list.add(contactList.nextLine());
//                System.out.println(list);
                //            contactList.close();
                //now read the file line by line...
                //            int lineNum = 0;
//                String line = contactList.next();
//                lineNum++;
//                System.out.println("deleting line " + lineNum + " entry for " + name + ".");
                //                ArrayList<String> ogContacts = (ArrayList<String>) Files.readAllLines(contacts);
                //                    ArrayList<String> modifyContacts = (ArrayList<String>) ogContacts;
//                int lineToRemove = lineNum - 1;
                //                list.remove(lineToRemove);
//                if (contactFinder.delete()) {
//                    System.out.println("File deleted successfully");
//                }
//                else {
//                    System.out.println("Failed to overwrite file with new deletion/entry");
//                }
//                delete(contacts);
//                createFile(contacts);
//                FileWriter writer = new FileWriter(String.valueOf(contacts));
//                for (String str : list) {
//                    writer.write(str + System.lineSeparator());
//                    writer.close();
//                }
//            }
//            catch (NoSuchElementException | IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }

//                    File newFile = new File();
//                    System.out.println(newFile);
//                    Files.createFile(contacts,
//                            (FileAttribute<?>) newFile,
//                            StandardOpenOption.WRITE);

//                    found filewriter example to delete and rewrite file at following website
//                    https://stackoverflow.com/questions/13729625/overwriting-txt-file-in-java
//                    File fold = new File(String.valueOf(contacts));
//                    fold.delete();

//                    File fnew = new File(String.valueOf(contacts));

//                    String source = textArea.getText();
//                    System.out.println(source);


    public static void displayAllContacts() throws Exception {
//        Scanner scanner = new Scanner(System.in);
        Path contacts = Paths.get("src", "contacts.txt");
        ArrayList<String> existingContacts = (ArrayList<String>) readAllLines(contacts);
        for (String contact : existingContacts) {
            System.out.println(contact);
        }
    }
}
//        System.out.println("Please enter the full name of the Contact to delete");
//        String name = scanner.nextLine();

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