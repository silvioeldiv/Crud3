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
@Table(name = "materias", catalog = "instituto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m"),
    @NamedQuery(name = "Materias.findByIdmaterias", query = "SELECT m FROM Materias m WHERE m.idmaterias = :idmaterias"),
    @NamedQuery(name = "Materias.findByNombreM", query = "SELECT m FROM Materias m WHERE m.nombreM = :nombreM"),
    @NamedQuery(name = "Materias.findByCreditosM", query = "SELECT m FROM Materias m WHERE m.creditosM = :creditosM")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmaterias", nullable = false)
    private Integer idmaterias;
    @Column(name = "nombre_m", length = 45)
    private String nombreM;
    @Column(name = "creditos_m")
    private Integer creditosM;
    @JoinColumn(name = "Alumno_idAlumno", referencedColumnName = "idAlumno", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno alumnoidAlumno;

    public Materias() {
    }

    public Materias(Integer idmaterias) {
        this.idmaterias = idmaterias;
    }

    public Integer getIdmaterias() {
        return idmaterias;
    }

    public void setIdmaterias(Integer idmaterias) {
        this.idmaterias = idmaterias;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public Integer getCreditosM() {
        return creditosM;
    }

    public void setCreditosM(Integer creditosM) {
        this.creditosM = creditosM;
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
        hash += (idmaterias != null ? idmaterias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idmaterias == null && other.idmaterias != null) || (this.idmaterias != null && !this.idmaterias.equals(other.idmaterias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Materias[ idmaterias=" + idmaterias + " ]";
    }
    
}
