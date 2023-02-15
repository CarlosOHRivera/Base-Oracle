package com.oh.baseoh.controlador;

import com.oh.baseoh.modelo.GradoAnio;
import com.oh.baseoh.repositorio.GradoAnioRepositorio;
import com.oh.baseoh.servicio.GradoAnioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/gradoanio")
public class GradoAnioController {

    @Autowired
    GradoAnioRepositorio gradoAnioRepositorio;
    @Autowired
    GradoAnioServicioImpl gradoAnioServicioImpl;

    @GetMapping("/nuevo")
    public String viewGradoAnioForm(Model model) {
        GradoAnio gradoAnio = new GradoAnio();
        model.addAttribute("formgradoanio", gradoAnio);
        return "view-gradoanio";
    }

    @PostMapping("/guardar")
    public String guardaGradoAnio(@ModelAttribute("formgradoanio") GradoAnio htmlgradoanio) {
        gradoAnioRepositorio.save(htmlgradoanio);
        return "redirect:/gradoanio/lista";
    }
    @GetMapping("/lista")
    public String GradoAnioList(Model model){
        List<GradoAnio> lista = gradoAnioServicioImpl.listargradoanio();
        model.addAttribute("gradoanioobj",lista);
        return "lista-gradoanio-html";


    }


}
