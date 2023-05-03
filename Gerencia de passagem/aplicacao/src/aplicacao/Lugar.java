package aplicacao;

public class Lugar {

	private String nomeLugar;
	private String pontoReferencia;
	public String getNomeLugar() {
		return nomeLugar;
	}
	public void setNomeLugar(String nomeLugar) {
		this.nomeLugar = nomeLugar;
	}
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	
	public Lugar(String nomeLugar, String pontoReferencia) {
		this.nomeLugar = nomeLugar;
		this.pontoReferencia = pontoReferencia;
	}
	public Lugar() {
		
	}
	
}
