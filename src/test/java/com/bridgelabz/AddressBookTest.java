package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {
    ArrayList<Contact> contact = new ArrayList<>();

    @Test
    public void whenPersonContactDetailsAddedToFile_ShouldReturn_True() {
        Contact contact1 = new Contact("Rinkesh",
                "Dubey",
                "SK-2, Sector - 93",
                "Noida",
                "UttarPradesh",
                201304,
                "7753907973",
                "rinkeshdubey2@gmail.com");

        Contact contact2 = new Contact("Jitu",
                "Kumar",
                "Jhansi",
                "Jhansi",
                "UttarPradesh",
                302301,
                "7756438976",
                "jitukumar@gmail.com");

        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);
        boolean isAdded = addressBook.addContact(contact);
        Assertions.assertTrue(isAdded);
    }

    @Test
    public void PersonContactDetailsAddedToFile_WhenRead_ShouldReturn_True() {
        Contact contact1 = new Contact("Rinkesh",
                "Dubey",
                "SK-2, Sector - 93",
                "Noida",
                "UttarPradesh",
                201304,
                "7753907973",
                "rinkeshdubey2@gmail.com");

        Contact contact2 = new Contact("Jitu",
                "Kumar",
                "Jhansi",
                "Jhansi",
                "UttarPradesh",
                302301,
                "7756438976",
                "jitukumar@gmail.com");

        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);
        boolean isAdded = addressBook.addContact(contact);
        if (isAdded) {
            boolean isRead = addressBook.viewContact();
            Assertions.assertTrue(isRead);
        }
    }
}
