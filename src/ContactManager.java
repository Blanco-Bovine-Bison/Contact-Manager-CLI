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
//        addContact();
//        searchFile();
//        deleteContact();
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

        write(contacts, List.of("\n" + newContact.getName() + " | " + newContact.getCell()), StandardOpenOption.APPEND);
//        store contacts.text into a ArrayList variable using File.read...etc
//         convert Contact to ArrayList
//        add ArrayList contact to contacts.txt using .APPEND
//
    }
//    Contact Ron = new Contact("Ron Swanson", "4182555555");

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

//        Make a java File object that contains all of contacts.txt.
//        In order to read that I need to use Scanner to read the Java File made from contacts.txt
//
        Scanner s = new Scanner(new File("src/contacts.txt"));

//        Now I need to convert what I am looking at with scanner to an arraylist so that I can later modify that list
        ArrayList<String> codex = new ArrayList<>();
//        manually insert every line of text from the file using a while loop
//        every line viewed with the scanner needs to be an arraylist element
        while (s.hasNextLine()) {
            codex.add(s.nextLine());
        }
//        close the scanner because reasons

        s.close();
//        sout system out print line a request
//        ask the user for the name
        System.out.println("Please provide a Name and/or Number to search our database.");
//        use a scanner to capture terminal input
//        create new scanner window to read from keyboard using System.in
        Scanner scanner = new Scanner(System.in);
//        we need to assign the value in the terminal to a variable using .nextLine()
        String searchInput = scanner.nextLine();
//        System.out.println(searchInput);
        // scan through database,
//      create a for each loop that loops that searches through codex element by element
        for (String arrayElement : codex) {
//            System.out.println(arrayElement);
            // if searchInput matches arrayElement
//      check to see if our user searchInput matches  the arrayElement
            if (arrayElement.contains(searchInput)) {

                // and return those elements.
                //                after finding Ron, print line to the terminal
                System.out.println(arrayElement);
            }
        }
    }

    // make a method deleteContact() that removes Ron
    public static void deleteContact() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/contacts.txt"));

//        Now I need to convert what I am looking at with scanner to an arraylist so that I can later modify that list
        ArrayList<String> codex = new ArrayList<>();
//        manually insert every line of text from the file using a while loop
//        every line viewed with the scanner needs to be an arraylist element
        while (s.hasNextLine()) {
            codex.add(s.nextLine());
        }
//        close the scanner because reasons

        s.close();
//        sout system out print line a request
//        ask the user for the name
        System.out.println("Please provide a Name and/or Number to delete our database.");
//        use a scanner to capture terminal input
//        create new scanner window to read from keyboard using System.in
        Scanner scanner = new Scanner(System.in);
//        we need to assign the value in the terminal to a variable using .nextLine()
        String searchInput = scanner.nextLine();
//        System.out.println(searchInput);
        // scan through database,
//      create a for each loop that loops that searches through codex element by element
//        for (String arrayElement : codex) {
////            System.out.println(arrayElement);
//            // if searchInput matches arrayElement
////      check to see if our user searchInput matches  the arrayElement
//            if (arrayElement.contains(searchInput)) {
//                codex.remove(arrayElement);
//            }
//
//        }
        //            System.out.println(arrayElement);
        // if searchInput matches arrayElement
        //      check to see if our user searchInput matches  the arrayElement
//            System.out.println(arrayElement);
        // if searchInput matches arrayElement
//      check to see if our user searchInput matches  the arrayElement
        codex.removeIf(arrayElement -> arrayElement.contains(searchInput));
//        in order to have an updated .txt delete the old contents and write the codex elements back in\
//        one line at a time
//        look at Path methods, found PrintWriter object can be used to overwrite txt file
//        adapted from https://www.codegrepper.com/code-examples/java/how+to+clear+a+text+file+in+java
//        by Karamolegkos may 05 2021
//        print each arraylist element to our txt file as a separate line in GIANT STRING FORM
//        using a for loop add each string element of codex to a new string with \n 's that will be uploaded to
//        contacts.txt
        StringBuilder newFileContents = new StringBuilder();
        int codexNumber = codex.size();
        for (var i = 0; i < codexNumber - 1; i++) {
            newFileContents.append(codex.get(i)).append("\n");
        }
        newFileContents.append(codex.get(codexNumber - 1));
        File file = new File("/Users/stout/IdeaProjects/Contacts-Manager-CLI/src/contacts.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print(newFileContents);
        writer.close();
//        overwrite existing file by deleting the contents of contacts.txt and rewriting the new array
//        when you write the new file, every "Contact" element gets its own line
    }

//        contact.txt convert this to a java File Object then make a Scanner Object that reads the file
//
//        step by step store every line of the text into an arraylist
//
//        find ron by iterating through the arraylist
//        check if the user input matches the array element using an if conditional
//
//        delete from the arraylist the entry that matches the user input
//        remove an element from an arraylist in java using partial string ......... Joe looks it up
//
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
//
//                    File newFile = new File();
//                    System.out.println(newFile);
//                    Files.createFile(contacts,
//                            (FileAttribute<?>) newFile,
//                            StandardOpenOption.WRITE);
//
//                    found filewriter example to delete and rewrite file at following website
//                    https://stackoverflow.com/questions/13729625/overwriting-txt-file-in-java
//                    File fold = new File(String.valueOf(contacts));
//                    fold.delete();
//
//                    File fnew = new File(String.valueOf(contacts));
//
//                    String source = textArea.getText();
//                    System.out.println(source);


    public static void displayAllContacts() throws Exception {
//        Scanner scanner = new Scanner(System.in);
        Path contacts = Paths.get("src", "contacts.txt");
        ArrayList<String> existingContacts = (ArrayList<String>) readAllLines(contacts);
        System.out.println("Name | Phone number");
        System.out.println("-------------------");
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