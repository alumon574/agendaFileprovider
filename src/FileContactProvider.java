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
        BufferedReader f_in = new BufferedReader(new FileReader("resources/contacts.txt"));
        PrintWriter f_Out = new PrintWriter(new FileWriter("resources/contacts.txt"));
        String contactInfo= f_in.readLine();
        int i=0;
        while (contactInfo!=null){
            i++;
            f_Out.println(i + ".-" + contactInfo);
            contactInfo=f_in.readLine();
        }
        f_in.close();
        f_Out.close();
    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
