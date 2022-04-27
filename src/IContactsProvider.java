import java.io.IOException;
import java.util.List;

public interface IContactsProvider {
    List<Contact> loadContacts();
    void add(Contact contact) throws IOException;
    void remove(Contact contact);
    void update(Contact contact);
}
