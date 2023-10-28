/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author silvi
 */
@Entity
@Table(name = "profesor", catalog = "instituto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p"),
    @NamedQuery(name = "Profesor.findByIdProfesor", query = "SELECT p FROM Profesor p WHERE p.idProfesor = :idProfesor"),
    @NamedQuery(name = "Profesor.findByNombreP", query = "SELECT p FROM Profesor p WHERE p.nombreP = :nombreP"),
    @NamedQuery(name = "Profesor.findByDniP", query = "SELECT p FROM Profesor p WHERE p.dniP = :dniP"),
    @NamedQuery(name = "Profesor.findByTelefono", query = "SELECT p FROM Profesor p WHERE p.telefono = :telefono")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProfesor", nullable = false)
    private Integer idProfesor;
    @Column(name = "nombre_p", length = 45)
    private String nombreP;
    @Column(name = "dni_p", length = 45)
    private String dniP;
    @Column(name = "telefono")
    private Integer telefono;
    @JoinColumn(name = "Alumno_idAlumno", referencedColumnName = "idAlumno", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno alumnoidAlumno;

    public Profesor() {
    }

    public Profesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDniP() {
        return dniP;
    }

    public void setDniP(String dniP) {
        this.dniP = dniP;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Alumno getAlumnoidAlumno() {
        return alumnoidAlumno;
    }

    public void setAlumnoidAlumno(Alumno alumnoidAlumno) {
        this.alumnoidAlumno = alumnoidAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.idProfesor == null && other.idProfesor != null) || (this.idProfesor != null && !this.idProfesor.equals(other.idProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Profesor[ idProfesor=" + idProfesor + " ]";
    }
    
}
