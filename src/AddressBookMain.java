
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

        AddressBook addressBook = new AddressBook();
        Contact contact = getInput();
     /*
    Adding Contacts details using Constructor of person class
    */
        Contact person1 = new Contact("amit", "dutt", "8165116516", "amit123@gmail.com", "kaithal", "Haryana", 84516548);
        Contact person2 = new Contact("ankita", "sharma", "49816515649", "ankita123@gmail.com", "mumbai", "haryana", 6558498);
        Contact person3 = new Contact("sumit", "kumar", "9146516549", "sumit123@gmail.com", "gurgaon", "maharashtra", 849840);
        Contact person4 = new Contact("anybody", "rana", "919848949848", "asdsa@gmail.com", "gurgaon", "haryana", 482702);
        Contact person5 = new Contact("anita", "sharma", "9119548989489", "anitasharma@gmail.com", "delhi", "delhi", 2554654);


        addressBook.addContact(person1);
        addressBook.addContact(person2);
        addressBook.addContact(person3);
        addressBook.addContact(person4);
    /*
    Java Stream to check duplicate entry and add a contact if contact is not present by filtering the contact
    with firstname and last name of the address book which is declared in equals and hashcode method
    in Contact class.
     */


        addressBook.getAddressbook().stream().filter(a -> a.equals(contact)).findAny().orElseGet(() -> {
            addressBook.getAddressbook().add(contact);
            return contact;
        });
    /*
    Printing all the contacts using for-each loop
    */
        addressBook.getAddressbook().stream().forEach(x -> System.out.println(x));

    }

}
