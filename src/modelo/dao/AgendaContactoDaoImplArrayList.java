package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

/*
* Se cargan los datos que han sido creados mediante los metodos de AgendaContactosDao
* */

public class AgendaContactoDaoImplArrayList implements AgendaContactoDao {

    private String nombreDeAgenda;
    private ArrayList<Contacto> contactos;

    public AgendaContactoDaoImplArrayList () {

        nombreDeAgenda = "nueva agenda";
        contactos = new ArrayList<>();

        cargardatos();

    }

    private void cargardatos() {
        contactos.add(new Contacto("Alejandra", "Villalva", "658947351", "alejandra@ifp.es", "MICROSOFT"));
        contactos.add(new Contacto("Monica", "Gonzalez", "619725313", "monica@ifp.es", "INTEL"));
        contactos.add(new Contacto("Sara", "Martinez", "671746396", "sara@ifp.es", "APPLE"));
        contactos.add(new Contacto("Maria", "Garcia", "675329040", "maria@ifp.es", "IBM"));
        contactos.add(new Contacto("Eva", "Soto", "604967138", "eva@ifp.es", "AMAZON"));
    }


    @Override
    public Boolean altaContacto(Contacto contacto) {
        if(!contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }else {
            return false;
    }

    @Override
    public Boolean eliminarContacto(Contacto contacto) {
            contactos.remove(contacto);

            return true;
    }

    @Override
    public Contacto buscarUno(String nombre) {
            Contacto contacto = new Contacto();
            contacto.setNombre(nombre);
            int pos = contactos.indexOf(contacto);

            if(pos == -1) {
                return null;
            }else {
                return contactos.get(pos);
            }
    }

    @Override
    public Contacto buscarTelefono(String telefono) {
            int posEncontrada=-1;


            for (int i = 0; i < contactos.size(); i++) {


                if (contactos.get(i).getTelefono()==telefono) {

                    posEncontrada=i;
                    break;
                }
            }

            if (posEncontrada == -1)

                return null;

            else

                return contactos.get(posEncontrada);
    }

    @Override
    public Contacto buscarEmail(String email) {
            int posEncontrada=-1;


            for (int i = 0; i < contactos.size(); i++) {


                if (contactos.get(i).getEmail()==email) {

                    posEncontrada=i;
                    break;
                }
            }

            if (posEncontrada == -1)

                return null;

            else

                return contactos.get(posEncontrada);
    }

    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
            ArrayList<Contacto> aux = new ArrayList<>();

            for (Contacto ele : contactos) {


                if (nombre.substring(0,3).equalsIgnoreCase(ele.getNombre().substring(0,3) ) ) {

                    aux.add(ele);
                }
            }
            return aux;
    }

    @Override
    public Boolean cambiarDatos(Contacto contacto) {
            int posicion = contactos.indexOf(contacto);


            if (posicion == -1) {
                return false;
            }else {
                contactos.set(posicion, contacto);
            }
            return true;
    }

    @Override
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
            ArrayList<Contacto> aux = new ArrayList<>();


            for (Contacto ele : contactos) {

                if(ele.getEmpresa() == empresa) {

                    aux.add(ele);

                }

            }
            return aux;
    }
