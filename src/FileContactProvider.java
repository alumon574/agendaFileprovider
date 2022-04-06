import java.io.*;
import java.util.List;

public class FileContactProvider implements IContactsProvider{

    @Override
    public List<Contact> loadContacts() {
        return null;
    }

    FileWriter f_Out = null;

    @Override
    public void add(Contact contact) throws IOException {
        PrintWriter f_Out = new PrintWriter(new FileWriter("resources/contacts.txt"));
        String cad=f_Out.readLine() ;
        }
        f_Out.close();
    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
