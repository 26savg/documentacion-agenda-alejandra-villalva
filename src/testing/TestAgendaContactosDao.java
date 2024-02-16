package testing;

import java.util.Iterator;

import modelo.dao.AgendaContactoDaoImplArrayList;
import modelo.javabean.Contacto;
/*
 *  Sirve para probar los metodos realizados y comprobar que funciona
 *  También para encontrar los errores en del proyecto
 * */
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
