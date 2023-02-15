package com.oh.baseoh.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PersonalPK implements Serializable {

    private int mes;
    private int anio;

    public PersonalPK(int mes, int anio) {
        this.mes = mes;
        this.anio = anio;
    }

    public PersonalPK() {
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalPK that = (PersonalPK) o;
        return mes == that.mes && anio == that.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes, anio);
    }
}
