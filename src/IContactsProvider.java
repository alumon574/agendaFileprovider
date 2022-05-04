import java.io.IOException;
import java.util.List;

public interface IContactsProvider {
    List<Contact> loadContacts() throws ExcepcionPrueba;
    void add(Contact contact) throws IOException, ExcepcionPrueba;
    void remove(Contact contact) throws ExcepcionPrueba;
    void update(Contact contact) throws ExcepcionPrueba;
}
