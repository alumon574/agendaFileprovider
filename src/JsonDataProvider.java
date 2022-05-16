import java.io.*;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonDataProvider implements IContactsProvider {
    Gson gson = new Gson();
    Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();

    public JsonDataProvider() throws IOException {
    }

    @Override
    public List<Contact> loadContacts() throws ExcepcionPrueba {
        List<Contact> contacts = new LinkedList<>();
        try (FileReader reader = new FileReader("./resources/contacts.json")) {
            Type listContact = new TypeToken<List<Contact>>(){}.getType();
            contacts = gson.fromJson(reader, listContact);
            if(contacts == null)
                contacts = new LinkedList<>();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public void save(List<Contact> listaContactos) {
        try (FileWriter writer = new FileWriter("./resources/contacts.json")) {
            String prettyPrinting = prettyGson.toJson(listaContactos);
            //String contacts = gson.toJson(listaContactos);

            writer.write(prettyPrinting);
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
