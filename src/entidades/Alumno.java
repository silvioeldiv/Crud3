
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "alumno", catalog = "instituto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByIdAlumno", query = "SELECT a FROM Alumno a WHERE a.idAlumno = :idAlumno"),
    @NamedQuery(name = "Alumno.findByNombreA", query = "SELECT a FROM Alumno a WHERE a.nombreA = :nombreA"),
    @NamedQuery(name = "Alumno.findByDniA", query = "SELECT a FROM Alumno a WHERE a.dniA = :dniA"),
    @NamedQuery(name = "Alumno.findByEdadA", query = "SELECT a FROM Alumno a WHERE a.edadA = :edadA"),
    @NamedQuery(name = "Alumno.findByTelefonoA", query = "SELECT a FROM Alumno a WHERE a.telefonoA = :telefonoA"),
    @NamedQuery(name = "Alumno.findByDireccionA", query = "SELECT a FROM Alumno a WHERE a.direccionA = :direccionA")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlumno", nullable = false)
    private Integer idAlumno;
    @Column(name = "nombre_a", length = 45)
    private String nombreA;
    @Column(name = "dni_a", length = 45)
    private String dniA;
    @Column(name = "edad_a", length = 45)
    private String edadA;
    @Column(name = "telefono_a")
    private Integer telefonoA;
    @Column(name = "direccion_a", length = 45)
    private String direccionA;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnoidAlumno", fetch = FetchType.LAZY)
    private List<Profesor> profesorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnoidAlumno", fetch = FetchType.LAZY)
    private List<Carrera> carreraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnoidAlumno", fetch = FetchType.LAZY)
    private List<Materias> materiasList;

    public Alumno() {
    }

    public Alumno(Integer idAlumno, String elmer, String usuario123, String password123, String datosAdicionales, String cxerro) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDniA() {
        return dniA;
    }

    public void setDniA(String dniA) {
        this.dniA = dniA;
    }

    public String getEdadA() {
        return edadA;
    }

    public void setEdadA(String edadA) {
        this.edadA = edadA;
    }

    public Integer getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(Integer telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getDireccionA() {
        return direccionA;
    }

    public void setDireccionA(String direccionA) {
        this.direccionA = direccionA;
    }

    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Alumno[ idAlumno=" + idAlumno + " ]";
    }
    
}
