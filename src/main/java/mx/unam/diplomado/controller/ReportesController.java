package mx.unam.diplomado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.unam.diplomado.modelo.entidades.Usuario;
import mx.unam.diplomado.service.UsuarioService;

@Controller
@RequestMapping("/formatos")
public class ReportesController {

    @Autowired
    private UsuarioService usuarioService;

    @ModelAttribute("usuarioList")
    public List<Usuario> getProductosList() {
        return usuarioService.getUsuarios();
    }

    @RequestMapping("/pdf")
    public String generarPdf(Model model) {
        return "pdfView";
    }

    @RequestMapping("/xls")
    public String generarXls(Model model) {
        return "xlsView";
    }

}
