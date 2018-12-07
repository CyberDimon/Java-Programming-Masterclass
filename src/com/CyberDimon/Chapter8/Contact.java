package com.CyberDimon.Chapter8;

import java.util.ArrayList;

public class Contact {

    private long phoneNumber;
    private String name;
    private ArrayList<String> contactsList = new ArrayList<>();

    public Contact(long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public static Contact createContact(long phoneNumber, String name) {
        return new Contact(phoneNumber, name);
    }

    public ArrayList<String> getContactsList() {
        return contactsList;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    private int findItem(String contact) {
        return contactsList.indexOf(contact);
    }

    public void addContact(String contact) {
        contactsList.add(contact);
        int contactId = findItem(contact);
        System.out.println("'" + contact + "'" + " has been added with id [" + contactId + "]");
    }

    public void removeContact(String contact) {
        int contactId = findItem(contact);
        if(contactId > -1) {
            removeContact(contactId);
            System.out.println("'" + contact + "'" + " has been removed from contact list");
        } else {
            System.out.println("There are no such " + "'" + contact + "'" + ".");
        }

    }

    private void removeContact(int contactId) {
        contactsList.remove(contactId);
    }

    public void editContact(String oldContact, String newContact) {
        int oldContactId = findItem(oldContact);
        if(oldContactId > -1) {
            editContact(oldContactId, newContact);
            System.out.println("'" + oldContact + "'" + " has been raplaced by " + "'" + newContact + "'");
        } else {
            System.out.println("There are no such " + "'" + oldContact + "'");
        }
    }

    private void editContact(int contactId, String newContact) {
        contactsList.set(contactId, newContact);
    }

    public void printContactsList() {
        int elements = contactsList.size();
        printLongLine();
        System.out.println("Contact book's username: " + this.name);
        System.out.println("Contact book's phone number " + this.phoneNumber);
        System.out.println("You have " + elements + " elements on your contacts list");
        for(int i = 0; i < elements; i++) {
            System.out.println("[" + (i + 1) + "] '" + contactsList.get(i) + "'");
        }
        printLongLine();
    }

    public boolean findContact(String contact) {
        int contactId = findItem(contact);
        if(contactId == -1) {
            System.out.println("There are no such " + "'" + contact + "'");
            return false;
        } else {
            System.out.println("'" + contact + "'" + " is present on list [" + contactId + "]");
            return true;
        }
    }

    private void printLongLine() {
        System.out.println("--- --- --- --- --- --- --- --- --- --- ---");
    }
}
