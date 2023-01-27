package ContactBook;

import java.util.ArrayList;

public class ContactManager {

    ArrayList<Contact> contacts;

    public ContactManager() {

        this.contacts = new ArrayList<Contact>();
    }

    public void setContacts(int index, Contact contact) {
        this.contacts.set(index, new Contact(contact));
    }

    public Contact getContacts(int index) {
        return new Contact(contacts.get(index));
    }

    public void addContact(Contact contact) {
        this.contacts.add(new Contact(contact));
    }

    public void removeContact(String name) {
        if (contacts.isEmpty()) {
            throw new IllegalArgumentException("You donot have any contact to remove");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                this.contacts.remove(i);
            }

        }
    }

    public String toSting() {
        String temp = "";
        for (int i = 0; i < contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }


}

