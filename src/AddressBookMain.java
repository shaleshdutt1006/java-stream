
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
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact(person1);
        addressBook1.addContact(person2);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact(person3);
        addressBook2.addContact(person4);
        addressBook2.addContact(person6);
        AddressBook addressBook3 = new AddressBook();
        addressBook3.addContact(person5);
        addressBook3.addContact(person3);
        AddressBook addressBook4 = new AddressBook();
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
        String city = "delhi";
        String state = "haryana";

    /*
    Taking a new list of type Contact named as result. In this we are getting values of map using map.entryset
     and flatmap is used to convert various address book into one list after we are getting value of it and
     then apply stream filter to get contact in the same city as the same city taken in the input.
     */
        Long contactsInSameCity = map.entrySet().stream().flatMap(e -> e.getValue().getAddressbook().stream()).filter(a -> a.getCity().equalsIgnoreCase(city)).collect(Collectors.counting());
        Long contactsInSameState = map.entrySet().stream().flatMap(e -> e.getValue().getAddressbook().stream()).filter(a -> a.getState().equalsIgnoreCase(state)).collect(Collectors.counting());
        System.out.println("------------------------------------------------->");
        System.out.println("Contacts in the Same city are : " + contactsInSameCity);
        System.out.println("------------------------------------------------->");
        System.out.println("Contacts in the Same state are : " + contactsInSameState);
        System.out.println("------------------------------------------------->");
    }
}