package com.oh.baseoh.servicio;

import com.oh.baseoh.modelo.GradoAnio;
import com.oh.baseoh.repositorio.GradoAnioRepositorio;
import com.oh.baseoh.servicio.GradoAnioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoAnioServicioImpl implements GradoAnioServicio {
    @Autowired
    GradoAnioRepositorio gradoAnioRepositorio;

    @Override
    public List<GradoAnio> listargradoanio() {
        return gradoAnioRepositorio.findAll();
    }
}
