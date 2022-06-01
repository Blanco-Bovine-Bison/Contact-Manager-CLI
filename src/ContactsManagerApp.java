import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManagerApp {
    public static void main(String[] args) throws IOException {

        String[] contactMenu = {
                "1- Add new contact",
                "2- Search by Name",
                "3- Delete by Name",
                "4- Display All Contacts",
                "5- Exit"
        };
        contactsManagerApp(contactMenu);
    }
    public static void contactsManagerApp(String[] menu) throws IOException {
        Path contacts = Paths.get("src", "contacts.txt");

//        welcome message


        int option;
        do {
            option = displayOptions(menu);
            switch (option) {

                case 1:
                    //                do something
                    contactsManagerApp(menu);
                    break;
                case 2:
//                    addContact();
                    //                do something
                    contactsManagerApp(menu);
                    break;
                case 3:
                    //                do something
                    contactsManagerApp(menu);
                    break;
                case 4:
                    System.out.println(readAllContacts(contacts));
                    //                do something
                    contactsManagerApp(menu);
                    break;
                case 5:
                    //                do something
                    break;
                default:
                    System.out.println("Please select a valid menu option and press enter/return using your keyboard");
                    contactsManagerApp(menu);
                    break;
            }
        } while (option != 5);
    }

    public static ArrayList<String> readAllContacts(Path filepath) throws FileNotFoundException, IOException {
        File fp = new File(String.valueOf(filepath));
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<String> lines = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) { lines.add(line); }

        fr.close();
        return lines;
    }
    //        while (option != 6) {
    //            displayOptions(contactMenu);
    //            option = scanner.nextInt();

//        Menu format taken from https://computinglearner.com/how-to-create-a-java-console-menu-application/

    private static int displayOptions(String[] contactMenu) {
            for (String menuItem : contactMenu){
                System.out.println(menuItem);
            }
        System.out.println("Welcome to Contacts Manager");
        System.out.println("Please choose from the following menu options by entering the corresponding\n" +
                "number and hitting the return/Enter button on your keyboard");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
    //  Welcome message
        //  Would you like to view or edit contacts (Y/N)?
        //
//      1. View contacts.
//      2. Add a new contact.
//      3. Search a contact by name.
//      4. Delete an existing contact.
//      5. Exit.
//      Enter an option (1, 2, 3, 4 or 5):

//

//    Show all your contacts
//    Add a new contact
//    Search a contact by her name
//    Delete an existing contact

//    Load all of the contacts by calling a method that returns a List of Contact objects.
//    Call a method that shows the user the main menu and returns their choice of action.
//    Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
//    Keep calling the method from step two until the user chooses to exit.
//    Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.