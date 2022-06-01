import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    public static void main(String[] args) {
    }
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String cell;
    //    Show all your contacts
    public Contact(String contact, String number) {
        this.name = contact;
        this.cell = number;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String contact) {
        this.name = contact;
    }
    public String getCell(){
        return this.cell;
    }
    public void setCell(String number) {
        this.cell = number;
    }

//    Add a new contact
//    Search a contact by her name
//    Delete an existing contact
}
