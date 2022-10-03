import java.util.Scanner;

public class AddressBookMain {

    public static Contact getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add details of a person you want to edit");

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zipCode = scanner.nextInt();

        System.out.println("Please provide phone number");
        String mobileNumber = scanner.next();

        System.out.println("Please provide email");
        String email = scanner.next();

        Contact contact = new Contact(firstName, lastName, mobileNumber, email, city, state, zipCode);
        return contact;
    }


    public static void main(String[] args) {

        Contact contact = getInput();
        AddressBook addressBook = new AddressBook();
        Contact person1 = new Contact("amit", "dutt", "651651654", "sumit@gmail.com", "kaithal", "845165489165", 5616);
        Contact person2 = new Contact("ankita", "sharma", "5949498", "sumit@gmail.com", "kurukshetra", "haryana", 94516498);
        Contact person3 = new Contact("sumit", "kumar", "5498489", "sumit@gmail.com", "bandra", "maharashtra", 4849849);
        Contact person4 = new Contact("anybody", "rana", "195494", "sumit@gmail.com", "gurgaon", "maharashtra", 44948);

        addressBook.addContact(person1);
        addressBook.addContact(person2);
        addressBook.addContact(person3);
        addressBook.addContact(person4);
/*
Java Stream to edit details of a person filtering the contact with firstname if firstName of the addressbook
is equal to contact first name then change it according to the input taken.
 */
        addressBook.getAddressbook().stream().filter(x -> x.getFirstName().equalsIgnoreCase(contact.getFirstName())).forEach(x -> {
            x.setLastName(contact.getLastName());
            x.setCity(contact.getCity());
            x.setEmail(contact.getEmail());
            x.setState(contact.getState());
            x.setZipCode(contact.getZipCode());
            x.setMobileNumber(contact.getMobileNumber());
        });

        addressBook.getAddressbook().stream().forEach(x -> System.out.println(x));
    }
}