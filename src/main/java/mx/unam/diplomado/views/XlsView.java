package mx.unam.diplomado.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import mx.unam.diplomado.modelo.entidades.Usuario;

public class XlsView extends AbstractXlsView {
	
	@Override
    protected void buildExcelDocument(
            Map<String, Object> model,
            Workbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // cambiar nombre de archivo
        response.setHeader("Content-Disposition", "attachment; filename=\"contactos.xls\"");

        // crear una pagina excel
        Sheet sheet = workbook.createSheet("Lista Usuarios");

        Row header = sheet.createRow(0);

        header.createCell(0).setCellValue("Nombre");
        header.createCell(1).setCellValue("Apellidos");
        header.createCell(2).setCellValue("Edad");
        header.createCell(3).setCellValue("Correo");

        int count_row = 1;

        for (Usuario usuario : (List<Usuario>) model.get("usuarioList")) {
            Row productoRow = sheet.createRow(count_row++);
            productoRow.createCell(0).setCellValue(usuario.getNombre());
            productoRow.createCell(1).setCellValue(usuario.getApellido1());
            productoRow.createCell(2).setCellValue(usuario.getEdad());
            productoRow.createCell(3).setCellValue(usuario.getCorreo1());
        }
    }

}
