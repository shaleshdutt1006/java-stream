
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

        AddressBook addressBook = new AddressBook();
         /*
        Contacts added using Constructor and print it using print function of Addressbook.
         */
        Contact contact = new Contact("shalesh", "dutt", "5465165", "sumit123@gmail.com", "hisar", "haryana", 129446);

        Contact contact1 = new Contact("Ankita", "sharma", "51651651", "sumit123@gmail.com", "ambala", "haryana", 129446);

        addressBook.addContact(contact);
        addressBook.addContact(contact1);
        addressBook.printAddressBook();
        /*
        Adding new Contact using addContact method and by taking input from the user using Scanner
        and calling input method and printing it
         */
        System.out.println("Please enter details of new contacts you want to add");
        Contact contact2 = getInput();
        addressBook.addContact(contact2);
        /*
        Adding new Contact using addContact method and by taking input from the user using Scanner
        and calling input method and printing it
         */

        System.out.println("Please enter details of new contacts you want to add");
        Contact contact3 = getInput();
        addressBook.addContact(contact3);

        System.out.println("Multiple Contacts of list are : ");
        addressBook.printAddressBook();

    }


}