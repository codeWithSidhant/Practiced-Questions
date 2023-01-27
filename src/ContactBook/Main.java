package ContactBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static ContactManager manager = new ContactManager();

    public static void main(String[] args) {


        try {
            /*loadContacts("FileContact");*/
            ManageContact();
        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
            }*/ catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanFile.nextLine(), scanFile.nextLine(), scanFile.nextLine());
                manager.addContact(contact);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        scanFile.close();

    }

    public static void ManageContact() throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Contact.\n"
                    + "Enter 2 to Remove Contact.\n"
                    + "Enter Anything to Exit. ");
            String opt = sc.next();

            if (opt.equals("1")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("\nPhone Number :");
                String phoneNumber = sc.nextLine();
                System.out.print("\nDate Of Birth :");
                String dateOfBirth = sc.next();
                if (name == null || name.isEmpty() || phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() < 10 || dateOfBirth == null || dateOfBirth.isEmpty()) {
                    System.out.println("\nRegistration failed... Enter again");
                } else {
                    try {
                        manager.addContact(new Contact(name, phoneNumber, dateOfBirth));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("\t\nUPDATED CONTACT LIST");
                        System.out.println(manager.toSting());
                    }
                }
            } else if (opt.equals("2")) {
                System.out.print("Enter contact Name to remove contact: ");
                String name = sc.next();
                System.out.print("\nPhone Number :");
                manager.removeContact(name);
                System.out.println("\t\nUPDATED CONTACT LIST");
                System.out.println(manager.toSting());


            } else {
                break;

            }

        }
        sc.close();
    }
}

