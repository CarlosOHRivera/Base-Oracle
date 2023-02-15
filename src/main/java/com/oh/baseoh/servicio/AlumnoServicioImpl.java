package com.oh.baseoh.servicio;

import com.oh.baseoh.modelo.Alumno;
import com.oh.baseoh.repositorio.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class AlumnoServicioImpl implements AlumnoServicio{
    @Autowired
    AlumnoRepositorio alumnoRepositorio;
    @Override
    public List<Alumno> listaalumnos() {
        return alumnoRepositorio.findAll();
    }
}
