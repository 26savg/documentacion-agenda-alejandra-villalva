package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class
{
    private String nombreAgenda;
    private ArrayList<Contacto> contactos;
    public AgendaContacto(String nombreAgenda, ArrayList<Contacto> contactos) {
        super();
        this.nombreAgenda = nombreAgenda;
        this.contactos = contactos;
    }
    public AgendaContacto() {
        super();
    }
    public String getNombreAgenda() {
        return nombreAgenda;
    }
    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
    @Override
    public String toString() {
        return "AgendaContacto [nombreAgenda=" + nombreAgenda + ", contactos=" + contactos + "]";
    }
}
