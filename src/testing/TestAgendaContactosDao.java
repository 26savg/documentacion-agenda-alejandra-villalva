package testing;

import java.util.Iterator;

import modelo.dao.AgendaContactoDaoImplArrayList;
import modelo.javabean.Contacto;

public class TestAgendaContactosDao {
    private static AgendaContactoDaoImplArrayList adao = new AgendaContactoDaoImplArrayList();

    static {
        adao = new AgendaContactoDaoImplArrayList();

    }

    public static void main(String[] args) {
        altaContacto();
        buscarContactosPorTresPrimeros();
        buscarUno();
        buscarTelefono();
        contactosPorEmpresa();
        cambiarDatos();
    }
}
