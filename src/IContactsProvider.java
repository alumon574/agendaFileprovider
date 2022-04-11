import java.io.IOException;
import java.util.List;

public interface IContactsProvider {
    List<Contact> loadContacts() throws IOException;
    void add(Contact contact) throws IOException;
    void remove(Contact contact);
    void update(Contact contact);
}
