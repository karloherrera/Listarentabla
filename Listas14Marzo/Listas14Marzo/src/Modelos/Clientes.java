
package Modelos;

public class Clientes {
    String apellidos;
    String nombre;
    String telefono;

    public Clientes(String apellidos, String nombre, String telefono) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
