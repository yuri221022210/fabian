package aplicacao;

public class Itinerario {
	
	private String diaSemana;
	private int hora1;
	private int minuto1;
	private String	nomeLugar1;
	private String pontoReferencia1;
	private Horario horario = new Horario();
	private Lugar lugar = new Lugar();

	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getHora1() {
		return hora1;
	}

	public void setHora1(int hora1) {
		this.hora1 = hora1;
		horario.setHora(hora1);
	}

	public int getMinuto() {
		return minuto1;
	}

	public void setMinuto(int minuto) {
		this.minuto1 = minuto;
		horario.setMinuto(minuto1);
	}
	public String getNomeLugar1() {
		return nomeLugar1;
	}
	public void setNomeLugar1(String nomeLugar1) {
		this.nomeLugar1 = nomeLugar1;
		lugar.setNomeLugar(nomeLugar1);
	}
	public String getPontoReferencia1() {
		return pontoReferencia1;
	}
	public void setPontoReferencia1(String pontoReferencia1) {
		this.pontoReferencia1 = pontoReferencia1;
		lugar.setPontoReferencia(pontoReferencia1);
	}
	public Itinerario(String diaSemana, int hora1, int minuto1, String nomeLugar1, String pontoReferencia1){
		horario.setHora(hora1);
		horario.setMinuto(minuto1);
		lugar.setNomeLugar(nomeLugar1);
		lugar.setPontoReferencia(pontoReferencia1);
		this.diaSemana = diaSemana;
		this.hora1 = hora1;
		this.minuto1 = minuto1;
		this.nomeLugar1 = nomeLugar1;
		this.pontoReferencia1 = pontoReferencia1;
		
		
	}
	public Itinerario() {
		
	}
	@Override
    public String toString() {
        return "Dia da Semana: "+diaSemana+
                "\nHorario do Onibus: "+hora1+":"+minuto1+
                "\nLugar do Onibus: "+nomeLugar1+
                "\nPonto Referencial: "+pontoReferencia1;
    }
	
}