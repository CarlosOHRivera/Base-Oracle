package com.oh.baseoh.controlador;

import com.oh.baseoh.modelo.Personal;
import com.oh.baseoh.repositorio.PersonalRepositorio;
import com.oh.baseoh.servicio.PersonalServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    PersonalRepositorio personalRepositorio;
    @Autowired
    PersonalServicioImpl personalServicioimpl;


    @GetMapping("/nuevo")
    public String viewPersonalForm(Model model) {
        Personal personal = new Personal();
        model.addAttribute("personal", personal);
        return "view-personal";
    }

    @PostMapping("/guardar")
    public String guardaPersonal(@ModelAttribute("personal") Personal htmlpersonal) {
        personalRepositorio.save(htmlpersonal);
        return "redirect:/personal/lista";
    }

    @GetMapping("/lista")
    public String Personallist(Model model){
        List<Personal> listaper= personalServicioimpl.listapersonal();
        model.addAttribute("personal",listaper);
        return "lista-personal-html";
    }

}
