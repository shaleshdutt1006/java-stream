
import java.util.*;
import java.util.stream.Collectors;


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


        AddressBook addressBookObj = new AddressBook();
        Contact person1 = new Contact("amit", "dutt", "651651654", "sumit@gmail.com", "kaithal", "845165489165", 5616);
        Contact person2 = new Contact("ankita", "sharma", "5949498", "sumit@gmail.com", "kurukshetra", "haryana", 94516498);
        Contact person3 = new Contact("sumit", "kumar", "5498489", "sumit@gmail.com", "bandra", "maharashtra", 4849849);
        Contact person4 = new Contact("sunita", "rana", "195494", "sumit@gmail.com", "delhi", "maharashtra", 44948);
        Contact person5 = new Contact("anita", "sharma", "9119548989489", "anitasharma@gmail.com", "delhi", "delhi", 2554654);
        Contact person6 = new Contact("puneet", "sharma", "9548989489", "punitsharma@gmail.com", "delhi", "delhi", 2554654);
    /*
    Adding contacts to different address books by using addContact method means every single addressbook
    has multiple contacts
    */
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(person1);
        addressBook.addContact(person2);
        addressBook.addContact(person3);
        addressBook.addContact(person4);
        addressBook.addContact(person6);
        addressBook.addContact(person5);
        Contact contact = getInput();
        addressBook.addContact(contact);




    /*
    Taking a new list of type Contact named as sortedaddressbook. In this we are sorting the contacts
    using their first name in alphabetically manner using Comparator and comparing by getting first name.
     */
        List<Contact> sortedaddressbook = addressBook.getAddressbook().stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList());

        sortedaddressbook.forEach(System.out::println);
    }
}