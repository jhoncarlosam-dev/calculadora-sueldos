package com.calculadora.sueldos.controller;

import com.calculadora.sueldos.model.Sueldo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SueldoController {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcularSueldo(@RequestParam("dias") int dias,
                                 @RequestParam("valor") double valor,
                                 Model model) {
        Sueldo sueldo = new Sueldo(dias, valor);
        model.addAttribute("sueldo", sueldo);
        return "resultado";
    }
}
