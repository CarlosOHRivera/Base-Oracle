package com.oh.baseoh.controlador;

import com.oh.baseoh.modelo.Alumno;
import com.oh.baseoh.repositorio.AlumnoRepositorio;
import com.oh.baseoh.servicio.AlumnoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    AlumnoServicioImpl alumnoServicioimpl;
    @Autowired
    AlumnoRepositorio alumnoRepositorio;
    @GetMapping("/nuevo")
    public String nuevoAlumno(Model model){
        Alumno alumno = new Alumno();
        model.addAttribute("alumnos" ,alumno );
        return "view-alumno";

    }

    @PostMapping("/guardar")
    public String guardarAlumno(@ModelAttribute("alumnos") Alumno htmlalumno ){
        alumnoRepositorio.save(htmlalumno);
        return "redirect:/alumnos/lista";
    }

    @GetMapping("/lista")
    public String AlumnosList(Model model) {
        List<Alumno> listaAl =alumnoServicioimpl.listaalumnos();
        model.addAttribute("alumnos", listaAl);
        //return "list";
        return "lista-alumnos-html";
    }
}
