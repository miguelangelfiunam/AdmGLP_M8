package mx.unam.diplomado.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import mx.unam.diplomado.modelo.entidades.Usuario;

public class PdfView extends AbstractPdfView {

	@Override
    protected void buildPdfDocument(
            Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Usuario> usuarios = (List<Usuario>) model.get("usuarioList");

        PdfPTable table = new PdfPTable(4);
        
        table.addCell("Nombre");
        table.addCell("Apellidos");
        table.addCell("Edad");
        table.addCell("Correo");

        for(Usuario usuario : usuarios ) {
        	table.addCell(usuario.getNombre());
            table.addCell(usuario.getApellido1());
            table.addCell(usuario.getEdad().toString());
            table.addCell(usuario.getCorreo1());
        }
        document.add(table);
    }
	
}
