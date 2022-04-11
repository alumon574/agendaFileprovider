import java.io.*;
import java.util.List;

public class FileContactProvider implements IContactsProvider{

    FileReader f_in = null;
    FileWriter f_Out = null;
    BufferedReader buf_in = null;
    String contactInfo;

    @Override
    public List<Contact> loadContacts() throws IOException {

        File prueba = new File("resources/contacts.txt");
        buf_in = new BufferedReader(new FileReader(prueba));
        contactInfo = buf_in.readLine();
        String contactParts[] = contactInfo.split(";");
        String contactID = contactParts[0];
        int contactIDint = Integer.parseInt(contactID);
        }
        f_in.close();
        return null;
    }

    @Override
    public void add(Contact contact) throws IOException {



    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
