
public class Incidencia {

	private String fecha;
	private int n_casos, n_casos_pcr;
	public Incidencia(String fecha, int n_casos, int n_casos_pcr) {
		super();
		this.fecha = fecha;
		this.n_casos = n_casos;
		this.n_casos_pcr = n_casos_pcr;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getN_casos() {
		return n_casos;
	}
	public void setN_casos(int n_casos) {
		this.n_casos = n_casos;
	}
	public int getN_casos_pcr() {
		return n_casos_pcr;
	}
	public void setN_casos_pcr(int n_casos_pcr) {
		this.n_casos_pcr = n_casos_pcr;
	}
	
}
