package com.oh.baseoh.servicio;

import com.oh.baseoh.modelo.Personal;
import com.oh.baseoh.repositorio.PersonalRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonalServicioImpl implements PersonalServicio {
    @Autowired
    PersonalRepositorio personalRepositorio;
    @Override
    public List<Personal> listapersonal() {
        return personalRepositorio.findAll();
    }
}
