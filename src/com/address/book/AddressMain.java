package com.address.book;

public class AddressMain {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addContacts();
        ab.listPeople();
        ab.removeContact();
        ab.editPerson();
    }

}