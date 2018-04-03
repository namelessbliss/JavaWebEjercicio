
package com.fc.curso.web.dao.domain;

/**
 *
 * @author NB
 */
public class Perfiles {
    private Integer idPerfil;
    private String perfil;
    private String descripcion;
    private String estatus;

    public Perfiles() {
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Perfiles{" + "idPerfil=" + idPerfil + ", perfil=" + perfil + ", descripcion=" + descripcion + ", estatus=" + estatus + '}';
    }
    
    
    
}
