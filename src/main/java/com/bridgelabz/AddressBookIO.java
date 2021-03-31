package com.bridgelabz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookIO {

    static AddressBookIO addressBookIO = new AddressBookIO();
    static Scanner scan = new Scanner(System.in);

    public boolean addContact(ArrayList<Contact> contact) {
        try {
            if (addressBookIO.checkAndWriteIntoFile(contact)) {
                System.out.println("\nContacts added Successfully");
            }
            return true;
        } catch (IOException e) {
            System.out.println("An Error Occurred.\nContact Not Added.");
            return false;
        }
    }

    public boolean checkAndWriteIntoFile(ArrayList<Contact> contact) throws IOException {
        String HOME = System.getProperty("user.dir");
        String fileName = "AddressBookIO.txt";
        Path homePath = Paths.get(HOME);
        if (Files.exists(homePath)) {
            Path filePath = Paths.get(HOME + "/" + fileName);
            try {
                if (Files.exists(filePath)) {
                    if (writeIntoFile(new File(fileName), contact)) {
                        return true;
                    }
                } else {
                    Files.createFile(filePath);
                    if (writeIntoFile(new File(fileName), contact)) {
                        return true;
                    }
                }
                return true;
            } catch (IOException e) {
                return false;
            }
        }
        return false;
    }

    public boolean writeIntoFile(File fileName, ArrayList<Contact> contact) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            for (Contact contact1 : contact) {
                myWriter.write(contact1 + "\n");
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println("An Error has occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean viewContact() {
        String HOME = System.getProperty("user.dir");
        String fileName = "AddressBookIO";
        Path homePath = Paths.get(HOME);
        if (Files.exists(homePath)) {
            Path filePath = Paths.get(HOME + "/" + fileName);
            if (Files.exists(filePath)) {
                Scanner myReader = new Scanner("AddressBookIO.txt");
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    myReader.close();
                }
                return true;
            }
        }
        return false;
    }

}

