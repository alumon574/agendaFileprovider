import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileContactProvider implements IContactsProvider {

    FileReader f_in = null;
    FileWriter f_Out = null;
    BufferedWriter buf_out = null;
    String contactInfo;
    Agenda agenda;


    @Override
    public List<Contact> loadContacts() throws ExcepcionPrueba {
        LinkedList<Contact> contacts = new LinkedList<>();
        File lector = new File("resources/contacts.txt");
        try (BufferedReader buf_in = new BufferedReader(new FileReader(lector))) {
            String linea = buf_in.readLine();
            while (linea != null) {
                String[] contactParts = linea.split(";");
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
           throw  new  ExcepcionPrueba();
        }

        return contacts;
    }

    public void save(List<Contact> listaContactos) {
        int id = 0;
        try (PrintWriter writer = new PrintWriter(new FileWriter("resources/contacts.txt"))) {
            for (Contact contact : listaContactos) {
                writer.write((id++) + ";" + contact.getName() + ";" + contact.getPhoneNumber() + ";" + contact.getAddress() + ";" + contact.getEmail() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Contact contact) throws ExcepcionPrueba {
        List<Contact> contacts = loadContacts();
        contacts.add(contact);
        save(contacts);
    }

    @Override
    public void remove(Contact contact) throws ExcepcionPrueba {
        List<Contact> contacts = loadContacts();
        contacts.remove(contact);
        save(contacts);
    }

    @Override
    public void update(Contact contact) throws ExcepcionPrueba {
        List<Contact> contacts = loadContacts();
        contacts.remove(contact);
        contacts.add(contact);
        save(contacts);
    }
}
