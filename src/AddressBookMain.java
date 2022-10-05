import java.io.*;

public class AddressBookMain {
    public static String readFromTheFile() throws IOException {
        /*
         * 1) Read the file
         */
        File file = new File("C:\\Users\\dell\\IdeaProjects\\AddressBook.txt");

        /*
         * 2) Create the object for input stream
         */
        InputStream inputStream = new FileInputStream(file);

        /*
         * 3) Create object of InputStreamReader
         */
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        /*
         * 4) Create BufferedReader gateway
         */
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        /*
         * 5) Create StringBuilder (As strings are immutable)
         */
        StringBuilder stringBuilder = new StringBuilder();

        /*
         * 6) Create result String
         */
        String result;

        /*
         * 7) Read the data line by line and compare
         */
        while ((result = bufferedReader.readLine()) != null) {

            /*
             * 8) Put the data into stringBuilder
             */
            stringBuilder.append(result).append("\n");
        }

        /*
         * 9) Close stringBuilder
         */
        bufferedReader.close();

        /*
         * 10) Print data
         */
        System.out.println("Before Adding the Addressbook is : ");

        System.out.println(stringBuilder);

        return stringBuilder.toString();

    }

    public static void writeInTheFile() throws IOException {
    /*
    Making a contact named as person
    */
        Contact person = new Contact("amit", "dutt", "651651654", "sumit@gmail.com", "kaithal", "haryana", 5616);

    /*
    Storing reading file into a String Message from file
    */

        String messageFromFile = readFromTheFile();
    /*
    Adding person to the read file
    */

        String finalMessage = messageFromFile + person;

    /*
    Giving location of the file where we have to write the file
     */

        FileWriter fileWriter = new FileWriter("C:\\Users\\dell\\IdeaProjects\\AddressBook.txt");

    /*
    Write the file with the Contact we have to add
    */
        fileWriter.write(finalMessage);

    /*
    Printing the file after writing the input in the file
    */
        System.out.println("After Writing the Addressbook is : ");
        System.out.println(finalMessage);
    /*
    Closing the file Writer
    */
        fileWriter.close();

    }


    public static void main(String[] args) throws IOException {

        writeInTheFile();


    }
}

