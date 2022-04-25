import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileContactProvider implements IContactsProvider {

    FileReader f_in = null;
    FileWriter f_Out = null;
    BufferedWriter buf_out = null;
    String contactInfo;


    @Override
    public List<Contact> loadContacts() {
        LinkedList<Contact> contacts = new LinkedList<>();
        File prueba = new File("resources/contacts.txt");
        try (BufferedReader buf_in = new BufferedReader(new FileReader(prueba))) {
            String linea = buf_in.readLine();
            while (linea != null) {
                String contactParts[] = linea.split(";");
                String contactID = contactParts[0];
                String contactName = contactParts[1];
                String contactPhonenumber = contactParts[2];
                String contactAddress = contactParts[3];
                String contactEmail = contactParts[4];
                int contactIDint = Integer.parseInt(contactID);

                contacts.add(new Contact(contactIDint, contactName, contactPhonenumber, contactAddress, contactEmail));

                linea = buf_in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contacts;
    }

    @Override
    public void add(Contact contact) {
        List<Contact> contacts = loadContacts();
//        buf_out.write(String.valueOf(contact));
    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
