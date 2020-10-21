import java.util.ArrayList;
import java.util.HashMap;



public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta_csv="C:\\proyectosjava\\003HashMapCOVID\\incidencias.csv";
		String ruta_html="C:\\proyectosjava\\003HashMapCOVID\\fichero.html";
		HashMap<String , ArrayList<Incidencia>> mapa_incidencias=AccesoFichero.leerFichero(ruta_csv);
		String html_tabla=PintaHTML.crearTabla (mapa_incidencias);
		GrabarFichero.grabarLinea(html_tabla,ruta_html);
	}

}
