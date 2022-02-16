package mx.unam.diplomado.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import mx.unam.diplomado.forms.UsuarioForm;
import mx.unam.diplomado.modelo.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.diplomado.service.UsuarioService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/guardaUsuario", method = RequestMethod.POST)
    public ModelAndView guardaContacto(@ModelAttribute("usuario") @Valid UsuarioForm usuarioForm, BindingResult result) {
        ModelAndView vista = new ModelAndView();
        if (result.hasErrors()) {
            vista.addObject(usuarioForm);
            vista.setViewName("usuarioForm");
        } else {
            System.out.println("OBJECT FORM==" + usuarioForm);
            Usuario usuario = usuarioForm.getIdUsuario() != null ? usuarioService.getUsuario(usuarioForm.getIdUsuario()) : new Usuario();
            
            usuario.setApodo(usuarioForm.getApodo());
            usuario.setCorreo1(usuarioForm.getCorreo1());
            usuario.setCorreo2(usuarioForm.getCorreo2());
            usuario.setNombre(usuarioForm.getNombre());
            usuario.setApellido1(usuarioForm.getApellido1());
            usuario.setApellido2(usuarioForm.getApellido2());
            usuario.setEdad(usuarioForm.getEdad());
            usuario.setFechaNacimiento(usuarioForm.getFechaNacimiento());
            usuario.setTelefono1(usuarioForm.getTelefono1());
            usuario.setTelefono2(usuarioForm.getTelefono2());
            usuarioService.guardaContacto(usuario);

            usuarioService.guardaContacto(usuario);
            vista.addObject("usuarios", usuarioService.getUsuarios());
            vista.setViewName("listaContactos");
        }
        return vista;

    }
}
