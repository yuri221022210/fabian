package aplicacao;

public class Horario {
	private int hora;
	private int minuto;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public float getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public Horario(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	public Horario() {
		// TODO Auto-generated constructor stub
	}

}
