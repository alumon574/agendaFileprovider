public class LanzaExcepcion {

    public void metodo(int a, int b) throws MiExcepcion {

        //...

        if (a < b) throw new MiExcepcion();

        //...

    }

}
