import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> addressbook = new ArrayList<Contact>();

    public ArrayList<Contact> addContact(Contact contact) {
        this.addressbook.add(contact);
        return this.addressbook;
    }

    public ArrayList<Contact> getAddressbook() {
        return addressbook;
    }

    public void setAddressbook(ArrayList<Contact> addressbook) {
        this.addressbook = addressbook;
    }
     /*
        Printing method to print all the contacts in the list using for each loop
         */

    public void printAddressBook() {
        for (Contact contact : this.addressbook) {

            System.out.println("-----------------------------------------------------");
            System.out.println("First name = " + contact.getFirstName());
            System.out.println("last name = " + contact.getLastName());
            System.out.println("address = " + contact.getEmail());
            System.out.println("city = " + contact.getCity());
            System.out.println("state = " + contact.getState());
            System.out.println("zip = " + contact.getZipCode());
            System.out.println("phone number = " + contact.getMobileNumber());
            System.out.println("-----------------------------------------------------");
        }
    }
}