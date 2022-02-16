package mx.unam.diplomado.controller;

import java.util.List;
import mx.unam.diplomado.forms.UsuarioForm;
import mx.unam.diplomado.modelo.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.diplomado.service.UsuarioService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @ResponseBody
    @RequestMapping(value = {"/jsonContacto"})
    public List<Usuario> tipoContactoJson() {
        return usuarioService.getUsuarios();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String cargaContacto(Model model) {
        model.addAttribute("usuarios", usuarioService.getUsuarios());
        return "usuarios";
    }
    
    @RequestMapping("/usuarioForm")
    public String usuarioForm(Model model) {
        model.addAttribute("usuario", new UsuarioForm());
        return "usuarioForm";
    }
}
