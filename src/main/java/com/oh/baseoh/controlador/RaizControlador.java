package com.oh.baseoh.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RaizControlador {
    @GetMapping("/")
    public String mostrarRaiz() {
        return "indice";
    }
}
