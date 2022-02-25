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
		// printing array list
		System.out.println(person);
	}

	// editing contact by searching names
	public void editPerson() {
		System.out.println("Enter the name to edit");
		String sc = scanner.next();

		for (int i = 0; i < person.size(); i++) {
			Contacts personn = person.get(i);
			if (sc.equals(personn.getFirstName())) {
				while (true) {
					System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)address\n"
							+ "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						personn.setFirstName(scanner.next());
						break;
					case 2:
						personn.setLastName(scanner.next());
						break;
					case 3:
						personn.setAddress(scanner.next());
						break;
					case 4:
						personn.setCity(scanner.next());
						break;
					case 5:
						personn.setState(scanner.next());
						break;
					case 6:
						personn.setZip(scanner.next());
						break;
					case 7:
						personn.setPhoneNumber(scanner.next());
						break;
					case 8:
						personn.setEmail(scanner.next());
						break;
					default:
						System.out.println("select correct choice");
						break;
					}
					if (choice == 9)
						break;
				}
				person.set(i, personn);
				System.out.println("person after editing");
				System.out.println(person);

			}
		}

	}

	public void deletePerson() {
		System.out.println("Enter the name to search and delete");
		String sc = scanner.next();
		for (int i = 0; i < person.size(); i++) {
			Contacts personn = person.get(i);
			if (sc.equals(personn.getFirstName())) {
				person.remove(i);
			}
		}
		System.out.println("contact after deletion");
		if (person.isEmpty() != true)
			System.out.println(person);
		else {
			System.out.println("contacts deleted");
		}
	}

	public void addMultiplePerson() {
		while (true) {
			System.out.println(
					"Enter the option \n1)To Add Contact\n2)To Edit Contact" + "\n3)To Delete Contact\n4)exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1 -> addPerson();
			case 2 -> editPerson();
			case 3 -> deletePerson();
			case 4 -> System.out.println("exiting");
			default -> System.out.println("invalid option");
			}
			if (option == 4)
				break;
		}
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome in Addressbook..!!!");
		addressBook.addMultiplePerson();

	}

}
