package mx.unam.diplomado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.diplomado.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String cargaContacto(Model model) {
        model.addAttribute("usuarios", usuarioService.getUsuarios());
        return "usuarios";
    }
}
