
package crud3;

import Controlador.UsuarioControlador;
import entidades.Alumno;


public class Crud3 {

    
    public static void main(String[] args) {
        UsuarioControlador us=new UsuarioControlador();
        Alumno alum = new Alumno (null,"elmer","4774","43","3449","cxerro");
        us.crear(alum);

    }
    
}
