package com.blz;

import java.util.LinkedList;
import java.util.Scanner;

public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	LinkedList<Contacts> person = new LinkedList<>();

	public void addPerson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		// creating contacts object and passing arguments inside constructor
		Contacts personn = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);
		// adding personn object into the linked list with Contact class data type
		person.add(personn);
		// printing person array list
		System.out.println(person);
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome in Addressbook..!!!");
		addressBook.addPerson();
	}

}
