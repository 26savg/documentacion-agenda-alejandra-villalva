package modelo.javabean;

import java.util.Objects;

/*
 * Aqui estan reflejados:
 * - Los atributos
 * - Los metodos constructores, para que java cree la estructura de los datos privados
 * - Los getter and setter con todos los atributos
 * - Los metodos de object se redefinen con toString, por lo que toda clase de java heredan de object
 * - Los metodos hash code and equals con generan con "nombre"
 *
 * */
public class Contacto {
    // 1. atributos
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;

    //2.1 los metodos constructores, para que java cree la estructura de los datos privados, constructor using field con todo
    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    // 2.2 constructor using field sin nada
    public Contacto() {
        super();
    }

    // 3. los getter and setter con t0do
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    //4. redefinir los metodos de object, toda clase de java heredan de object
    //- de momento redefinidos: generate toString con t0do (field)
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
                + ", empresa=" + empresa + "]";
    }

    // 5. generar hash code and equals con: "nombre"

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
