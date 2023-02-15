package com.oh.baseoh.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personal")
public class Personal {
    @EmbeddedId
    private PersonalPK llave;

    @Basic
    @Column(name = "NOMBRE", nullable = true, length = 20)
    private String nombre;

    public Personal() {
        super();
    }

    public Personal(PersonalPK llave, String nombre) {
        this.llave = llave;
        this.nombre = nombre;
    }

    public PersonalPK getLlave() {
        return llave;
    }

    public void setLlave(PersonalPK llave) {
        this.llave = llave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
