package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public interface AgendaContactoDao {

    Boolean altaContacto(Contacto contacto);
    Boolean eliminarContacto(Contacto contacto);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);
    Boolean cambiarDatos(Contacto contacto);
    ArrayList<Contacto> contactosPorEmpresa(String empresa);

}
