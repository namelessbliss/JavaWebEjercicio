
package com.fc.curso.web.dao.domain;

import java.util.Date;



/**
 *
 * @author Administrador
 */
public class Usuarios {
private String  usuario;
private Perfiles perfiles;
private String  pass;
private Date fchVigencia;
private String estatus;

    public Usuarios() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Perfiles getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Perfiles perfiles) {
        this.perfiles = perfiles;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getFchVigencia() {
        return fchVigencia;
    }

    public void setFchVigencia(Date fchVigencia) {
        this.fchVigencia = fchVigencia;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", perfiles=" + perfiles + ", pass=" + pass + ", fchVigencia=" + fchVigencia + ", estatus=" + estatus + '}';
    }


}
