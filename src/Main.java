import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ExcepcionPrueba {
//        Contact contact = new Contact("Pepe", "123456789", "C/Bonita", "pepe@gmail.com");
//        System.out.println(contact);

//        Agenda agenda = new Agenda(new FileContactProvider());
//        System.out.println(agenda);
//
//        Contact contact = agenda.retrieve(0);
//        contact.setName("Juan Antonio");
//        agenda.update(contact);
//
//        System.out.println(agenda);
//        FileContactProvider fileContactProvider=new FileContactProvider();
//        Contact contactTest = new Contact(4,"prueba","123456789","calle","mail");
//        Contact contactTest2 = new Contact(4,"segundo","987654321","calle","mail");
//        fileContactProvider.loadContacts();
        FileContactProvider fileContactProvider=new FileContactProvider();
        Contact contactPrueba = new Contact(0,"a","numero","calle","correo");
//        Contact contactPrueba2 = new Contact(1,"b","numero","calle","correo");
        fileContactProvider.update(contactPrueba);

    }

}
