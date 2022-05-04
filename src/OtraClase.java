public class OtraClase {

    public static void main(String[] argv) {

        LanzaExcepcion le = new LanzaExcepcion();

        try {

            le.metodo(3, 4);

        } catch (MiExcepcion e) {

            System.err.println(e.getMessage());

        }

    }

}
