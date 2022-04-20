

package com.address.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contacts> people = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public void welcomeMessage() {
        System.out.println("welcome to address book system");
    }

    public void addContacts() {
        Contacts contacts = new Contacts();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Name:");
        String firstName = sc.nextLine();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();
        contacts.setLastName(lastName);

        System.out.println("Enter Adress:");
        String adress = sc.nextLine();
        contacts.setAddress(adress);

        System.out.println("Enter city:");
        String city = sc.nextLine();
        contacts.setCity(city);

        System.out.println("Enter state:");
        String state = sc.nextLine();
        contacts.setState(state);

        System.out.println("Enter zip:");
        String zip = sc.nextLine();
        contacts.setZip(zip);

        System.out.println("Enter phoneNumber:");
        String phoneNumber = sc.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter email:");
        String email = sc.nextLine();
        contacts.setEmail(email);

        people.add(contacts);
        System.out.println("person created sucessfully");
    }


    public void listPeople()
    {
        if (people.isEmpty() )
        {
            System.out.println("Your address book is empty.");
            return;
        }
        System.out.println("\n Address Book:");
        for (Contacts person : people)
        {
            System.out.println(person.getFirstName());
        }

    }



    public void removeContact()
    {
        System.out.println("Enter the first name you want to remove.");
        String firstName = sc.nextLine();
        for(int i=0;i<people.size();i++) {
            if(people.get(i).getFirstName().equals(firstName)) {
                people.remove(people.get(i));
                System.out.println("person removed sucessfully");
            }
            else {
                System.out.println("person not found");
            }

        }
    }

    public void editPerson()
    {
        System.out.println("Enter the first name you want to edit.");

        String firstName = sc.nextLine();

        for (Contacts person : people) {
            if (person.getFirstName().equals(firstName)) {

                person.setFirstName(firstName);

                System.out.println("Enter Last Name:");
                String lastName = sc.nextLine();
                person.setLastName(lastName);

                System.out.println("Enter Adress:");
                String address = sc.nextLine();
                person.setAddress(address);

                System.out.println("Enter state:");
                String state = sc.nextLine();
                person.setState(state);

                System.out.println("Enter zip:");
                String zip = sc.nextLine();
                person.setZip(zip);

                System.out.println("Enter phoneNumber:");
                String phoneNumber = sc.nextLine();
                person.setPhoneNumber(phoneNumber);

                System.out.println("Enter email:");
                String email = sc.nextLine();
                person.setEmail(email);

                System.out.println("person edited sucessfully");
            } else {
                System.out.println("person not found");
            }

        }
    }


}