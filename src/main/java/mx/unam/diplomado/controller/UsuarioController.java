package mx.unam.diplomado.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import mx.unam.diplomado.forms.UsuarioForm;
import mx.unam.diplomado.modelo.entidades.Contra;
import mx.unam.diplomado.modelo.entidades.Rol;
import mx.unam.diplomado.modelo.entidades.Usuario;
import mx.unam.diplomado.modelo.entidades.UsuarioRol;
import mx.unam.diplomado.service.ContraService;
import mx.unam.diplomado.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.diplomado.service.UsuarioService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    ContraService contraService;

    @ResponseBody
    @RequestMapping(value = {"/jsonUsuario"})
    public List<Usuario> tipoUsuarioJson() {
        return usuarioService.getUsuarios();
    }

    @PostMapping("/buscarUsuariosPorEstatus")
    public String cargaUsuariosPorEstatus(Model model, @RequestParam(name = "estatusSelect") Integer estatus) {
        model.addAttribute("usuarios", usuarioService.getUsuariosPorEstatus(estatus));
//        model.addAttribute("estatusSelect", estatus);
        return "usuarios";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String cargaUsuario(Model model) {
        model.addAttribute("usuarios", usuarioService.getUsuarios());
        return "usuarios";
    }

    @RequestMapping("/usuarioForm")
    public String usuarioForm(Model model) {
        model.addAttribute("usuario", new UsuarioForm());
        return "usuarioForm";
    }

    @RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
    @Transactional
    public ModelAndView guardaUsuario(@ModelAttribute("usuario") @Valid UsuarioForm usuarioForm, BindingResult result) {
        ModelAndView vista = new ModelAndView();
        if (result.hasErrors()) {
            vista.addObject(usuarioForm);
            vista.setViewName("usuarioForm");
        } else {
            System.out.println("OBJECT FORM==" + usuarioForm);
            Usuario usuario = null;
            if (usuarioForm.getIdUsuario() != null) {
                usuario = usuarioService.getUsuario(usuarioForm.getIdUsuario());
                usuario.setFecActualizacion(new Date());
            } else {
                usuario = new Usuario();
                usuario.setFecRegistro(new Date());
                usuario.setEstatus(10);

                Contra contra = new Contra(usuarioForm.getContra(), new Date(), null, 10);
                contraService.guardaContra(contra);
                usuario.setContra(contra);

            }

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
            usuarioService.guardaUsuario(usuario);
            
            Set<UsuarioRol> usuariosRoles = new HashSet<UsuarioRol>();
            Rol rol = rolService.getRol(usuarioForm.getIdRol());
            UsuarioRol usuarioRol = new UsuarioRol();
            usuarioRol.setUsuario(usuario);
            usuarioRol.setRol(rol);
            usuarioRol.setFecRegistro(new Date());
            usuarioRol.setEstatus(10);
            usuariosRoles.add(usuarioRol);
            usuario.setUsuariosRoles(usuariosRoles);
            usuarioService.guardaUsuario(usuario);

            vista.addObject("usuarios", usuarioService.getUsuarios());
            vista.setViewName("usuarios");
        }
        return vista;
    }

    @RequestMapping("/actualizar/{usuarioId}")
    public String showFormForUpdate(@PathVariable Integer usuarioId, Model model) {
        Usuario usuario = usuarioService.getUsuario(usuarioId);
        if (usuario != null) {
            UsuarioForm usuarioForm = new UsuarioForm();
            usuarioForm.setIdUsuario(usuarioId);
            usuarioForm.setApodo(usuario.getApodo());
            usuarioForm.setCorreo1(usuario.getCorreo1());
            usuarioForm.setCorreo2(usuario.getCorreo2());
            usuarioForm.setNombre(usuario.getNombre());
            usuarioForm.setApellido1(usuario.getApellido1());
            usuarioForm.setApellido2(usuario.getApellido2());
            usuarioForm.setEdad(usuario.getEdad());
            usuarioForm.setFechaNacimiento(usuario.getFechaNacimiento());
            usuarioForm.setTelefono1(usuario.getTelefono1());
            usuarioForm.setTelefono2(usuario.getTelefono2());
            usuarioForm.setContra(usuario.getContra().getContraCifrado());

            Set<UsuarioRol> usuariosRoles = usuario.getUsuariosRoles();
            if (usuariosRoles != null && !usuariosRoles.isEmpty()) {
                for (Iterator<UsuarioRol> it = usuariosRoles.iterator(); it.hasNext();) {
                    UsuarioRol usuarioRol = it.next();
                    usuarioForm.setIdRol(usuarioRol.getRol().getIdRol());
                }
            }

            model.addAttribute("usuario", usuarioForm);
        } else {
            model.addAttribute("usuario", new UsuarioForm());
        }
        return "usuarioForm";
    }

    @RequestMapping("eliminar")
    public String eliminaContacto(@RequestParam("usuarioId") Integer idUsuario) {
        usuarioService.eliminaUsuario(idUsuario);
        return "redirect:/usuarios/getAll";
    }
}
