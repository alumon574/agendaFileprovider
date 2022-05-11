import java.io.Serializable;

public class Contacto implements Serializable {

  /**

     * Versión 1. serialVersionUID sirve para asegurarnos que serializamos/deserializamos

     * objetos de la misma versión (puede que entre versiones haya cambiado la signatura de la

     * clase y nos dé errores. Cuando cambia la signatura se debe modificar este valor 

     */

    private static final long serialVersionUID = 1L;


  private String nombre=null;

  private String numero;

  private String direccion;

  private String mail;

  public Contacto(){

  }

  public Contacto(String nombre, String numero, String direccion, String mail){


    this.nombre = nombre;

    this.numero= numero;

    this.direccion = direccion;

    this.mail = mail;

  }


  public String getNombre(){

    return this.nombre;

  }

  public String getNumero(){

    return this.numero;

  }

  public String getDireccion() {
    return direccion;
  }

  public String getMail(){

    return this.mail;

  }


}