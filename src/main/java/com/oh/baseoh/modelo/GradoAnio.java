package com.oh.baseoh.modelo;

import javax.persistence.*;

@Entity
@Table(name = "GRADO_ANIO", schema = "OH", catalog = "")
public class GradoAnio {
    @EmbeddedId
    private GradoAnioPK llave;
    private String profesor;

    public GradoAnio(GradoAnioPK llave, String profesor) {
        this.llave = llave;
        this.profesor = profesor;
    }

    public GradoAnio() {super();
    }

    public GradoAnioPK getLlave() {
        return llave;
    }

    public void setLlave(GradoAnioPK llave) {
        this.llave = llave;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "GradoAnio{" +
                "llave=" + llave +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
