package com.oh.baseoh.modelo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlumno")
    private Long idAlumno;
    @Column(length = 30)
    private String Nombre;
    @Column(length = 30)
    private String Apellido;
    @Column(precision = 7, scale = 2)
    private BigDecimal cuota;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, BigDecimal cuota) {
        Nombre = nombre;
        Apellido = apellido;
        this.cuota = cuota;
    }

    public Alumno(Long idAlumno, String nombre, String apellido, BigDecimal cuota) {
        this.idAlumno = idAlumno;
        Nombre = nombre;
        Apellido = apellido;
        this.cuota = cuota;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public BigDecimal getCuota() {
        return cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", cuota=" + cuota +
                '}';
    }
}
