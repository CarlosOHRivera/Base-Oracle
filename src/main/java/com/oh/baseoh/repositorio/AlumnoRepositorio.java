package com.oh.baseoh.repositorio;

import com.oh.baseoh.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno,Long> {
}
