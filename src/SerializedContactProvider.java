import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class SerializedContactProvider implements IContactsProvider {

    FileReader f_in = null;
    FileWriter f_Out = null;
    BufferedWriter buf_out = null;

    String contactInfo;
    Agenda agenda;

    public SerializedContactProvider() throws IOException {
    }

    @Override
    public List<Contact> loadContacts() throws ExcepcionPrueba {
        LinkedList<Contact> contacts = new LinkedList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./resources/serializar.obj"))) {

            Contact contact;
            while (true){
                contact=(Contact) objectInputStream.readObject();
                contacts.add(contact);
                System.out.println("ID: " + contact.getId());
                System.out.println("nombre: " + contact.getName());
                System.out.println("numero: " + contact.getPhoneNumber());
                System.out.println("direccion: " + contact.getAddress());
                System.out.println("mail: " + contact.getEmail());
                System.out.println();
            }
        }
        catch(EOFException eof){

        }
        catch (IOException e) {
           throw  new  ExcepcionPrueba();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return contacts;
    }

    public void save(List<Contact> listaContactos) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./resources/serializar.obj"))) {
            for (Contact contacto: listaContactos) {
               objectOutputStream.writeObject(contacto);
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