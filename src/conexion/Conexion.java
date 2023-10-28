package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
    private static Conexion instancia = new Conexion();
    private EntityManagerFactory fabrica;

    private Conexion() {
        fabrica = Persistence.createEntityManagerFactory("Crud3PU");
    }

    public static Conexion getInstancia() {
        return instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }

    public EntityManager getEntityManager() {
        return fabrica.createEntityManager();
    }
}
