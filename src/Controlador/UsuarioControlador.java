package Controlador;

import conexion.Conexion;
import entidades.Alumno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioControlador {
    public void crear(Alumno a){
        EntityManager en=entityManager();
        try {
         en.getTransaction() .begin(); //INICIAR LA TRANSSANCION
        en.persist(a);
        en.getTransaction().commit(); //inserta la trassancion
        } catch (Exception e) {
            en.getTransaction().rollback();
        }
            
        
      
        
    }
    public void editar(Alumno a){
        EntityManager en=entityManager();
        try {
         en.getTransaction() .begin(); //INICIAR LA TRANSSANCION
        en.merge(a);
        en.getTransaction().commit(); //inserta la trassancion
        } catch (Exception e) {
            en.getTransaction().rollback();
        }
            
        
      
        
    }
     public void eliminar(Alumno a){
        EntityManager en=entityManager();
        try {
         en.getTransaction() .begin(); //INICIAR LA TRANSSANCION
        en.remove(a);
        en.getTransaction().commit(); //inserta la trassancion
        } catch (Exception e) {
            en.getTransaction().rollback();
        }
            
        
      
        
    }

    public List<Alumno>todosLosAlumnos(){
            Query q=entityManager().createQuery("SELECT a FROM Alumno a");
            return q.getResultList();
        
    }
    
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}

