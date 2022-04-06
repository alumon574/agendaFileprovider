import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Contact contact = new Contact("Pepe", "123456789", "C/Bonita", "pepe@gmail.com");
//        System.out.println(contact);

        /*Agenda agenda = new Agenda(new FileContactProvider());
        System.out.println(agenda);

        Contact contact = agenda.retrieve(0);
        contact.setName("Juan Antonio");
        agenda.update(contact);

        System.out.println(agenda);*/
        FileContactProvider fileContactProvider=new FileContactProvider();
        Contact contactTest = new Contact(4,"prueba","123456789","calle","mail");
        fileContactProvider.add(contactTest);
    }

}
