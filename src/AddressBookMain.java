
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AddressBookMain {

    public static Contact getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add details of a person you want to add");

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

    /*
    Adding Contacts details using Constructor of person class
    */
        Contact person1 = new Contact("amit", "dutt", "8165116516", "amit123@gmail.com", "kaithal", "Haryana", 84516548);
        Contact person2 = new Contact("ankita", "sharma", "49816515649", "ankita123@gmail.com", "mumbai", "haryana", 6558498);
        Contact person3 = new Contact("sumit", "kumar", "9146516549", "sumit123@gmail.com", "pune", "maharashtra", 849840);
        Contact person4 = new Contact("anybody", "rana", "919848949848", "asdsa@gmail.com", "gurgaon", "haryana", 482702);
        Contact person5 = new Contact("anita", "sharma", "9119548989489", "anitasharma@gmail.com", "delhi", "delhi", 2554654);

    /*
    Adding contacts to different address books by using addContact method means every single addressbook
    has multiple contacts
    */
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact(person1);
        addressBook1.addContact(person2);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact(person3);
        addressBook2.addContact(person4);
        AddressBook addressBook3 = new AddressBook();
        addressBook3.addContact(person5);
        addressBook3.addContact(person3);
        addressBook3.addContact(person1);
        AddressBook addressBook4 = new AddressBook();
        addressBook4.addContact(getInput());
        addressBook4.addContact(getInput());

    /*
    Creating hashmap of keys String type and value of addressbook
    */

        Map<String, AddressBook> map = new HashMap<>();
    /*
    putting different address books in the map. Map has two parts first one is key
    and Second one is value
    */

        map.put("addressBook1", addressBook1);
        map.put("addressBook2", addressBook2);
        map.put("addressBook3", addressBook3);
        map.put("addressBook4", addressBook4);

    /*
    for-each loop to print keys and values. e.getkey() to print keys and getting values using calling print function of
    address book we can use toString also to override the memory otherwise it shows memory location of address book only.
    by using printAddressBook function it shows every detail of the contact.
     */

        for (Map.Entry<String, AddressBook> e : map.entrySet()) {
            System.out.println(e.getKey());
            e.getValue().printAddressBook();

        }


    }


}