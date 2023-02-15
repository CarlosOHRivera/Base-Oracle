package com.oh.baseoh.controlador;

import com.oh.baseoh.modelo.Alumno;
import com.oh.baseoh.servicio.AlumnoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    AlumnoServicioImpl alumnoServicioimpl;

    @GetMapping("/lista")
    public String AlumnosList(Model model) {
        List<Alumno> listaAl =alumnoServicioimpl.listaalumnos();
        model.addAttribute("alumnos", listaAl);
        //return "list";
        return "lista-alumnos-html";
    }
}
