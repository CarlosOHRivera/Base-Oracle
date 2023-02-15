package com.oh.baseoh.modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GradoAnioPK implements Serializable {
    private String grado;
    private String anio;

    public GradoAnioPK() {super();
    }

    public GradoAnioPK(String grado, String anio) {
        this.grado = grado;
        this.anio = anio;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "GradoAnioPK{" +
                "grado='" + grado + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradoAnioPK that = (GradoAnioPK) o;
        return Objects.equals(grado, that.grado) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grado, anio);
    }
}
