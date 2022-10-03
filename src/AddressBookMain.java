import java.util.Scanner;

public class AddressBookMain {

    public static Contact input(Scanner scanner) {

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String mobileNumber = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zipCode = scanner.nextInt();

        System.out.println("Please provide phone number");
        String email = scanner.next();

        Contact contact = new Contact(firstName, lastName, mobileNumber, email, city, state, zipCode);

        return contact;
    }


    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
/*
Contacts added using Constructor and print it using print function of addressbook
 */
        Contact person = new Contact("shalesh", "dutt", "1654684", "sumit@gmail.com", "kurukshetra","Haryana", 454780);
        addressBook.addContact(person);
        System.out.println("Before adding Contacts are");
        addressBook.printAddressBook();
/*
Adding new Contact using addContact method and by taking input from the user using Scanner and calling input method
and printing it
 */
        System.out.println("Please enter details of new contacts you want to add");
        Contact contact1 = input(scanner);
        addressBook.addContact(contact1);
        System.out.println("After adding new contacts are");
        addressBook.printAddressBook();
    }

}