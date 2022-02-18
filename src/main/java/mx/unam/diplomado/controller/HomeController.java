package mx.unam.diplomado.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import mx.unam.diplomado.modelo.entidades.Estatus;
import mx.unam.diplomado.service.EstatusService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private EstatusService estatusService;

    @RequestMapping(value = "/")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        List<Estatus> estatusUsuarios = estatusService.getEstatusPorTabla("t_usuario");
        servletContext.setAttribute("estatusUsuarios", estatusUsuarios);
        return new ModelAndView("home");
    }
}
