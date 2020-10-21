import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class AccesoFichero {

	public static HashMap<String, ArrayList<Incidencia>> leerFichero(String ruta) {
		HashMap<String , ArrayList<Incidencia>> mapa=new HashMap<String, ArrayList<Incidencia>>();
		ArrayList<Incidencia> lista_incidencias=new ArrayList<Incidencia>();
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br=new BufferedReader(fr);
			String linea=br.readLine();
			
			while(linea!=null)
			{
				
				String[] datos=linea.split(",");
				String codigo=datos[0];
				String fecha=datos[1];
				String n_casos=datos[2];
				String n_casos_pcr=datos[3];
				Incidencia i=new Incidencia(fecha, Integer.parseInt(n_casos), Integer.parseInt(n_casos_pcr));
				if (mapa.containsKey(codigo)) {
					lista_incidencias.add(i);
				}
				else
				{
					mapa.put(codigo, lista_incidencias);
				}
				linea=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return mapa;
	}

}
