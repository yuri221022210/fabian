package model;


public class Itinerario {

	private boolean diaOuNoite;
	private boolean chegadaOuSaida;
	private String diaSemana;
	private int   dia;
	private int   mes;
	private int   ano;
	private String nomeLugar1;
	private String pontoReferencia1;
	private Lugar lugar = new Lugar();

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public boolean getDiaOuNoite() {
		 return diaOuNoite;
	}
	
	public void setDiaOuNoite(boolean diaOuNoite) {
		this.diaOuNoite = diaOuNoite;
	}
	
	public boolean getchegadaOuSaida() {
		return chegadaOuSaida;
	}
	
	public void setchegadaOuSaida(boolean chegadaOuSaida) {
		this.chegadaOuSaida = chegadaOuSaida;
	}
	
	public String getNomeLugar1() {
		return nomeLugar1;
	}

	public void setNomeLugar1(String nomeLugar1) {
		this.nomeLugar1 = nomeLugar1;
		lugar.setNomeLugar(nomeLugar1);
	}
	
	public int  setdia() {
		return dia;
	}
	public void getdia(int dia) {
		this.dia = dia;
	}
	public int  setmes() {
		return mes;
	}
	public void getmes(int mes) {
		this.mes = mes;
	}
	public int  setdano() {
		return ano;
	}
	public void getano(int ano) {
		this.ano = ano;
	}
	
	
	public String getPontoReferencia1() {
		return pontoReferencia1;
	}

	public void setPontoReferencia1(String pontoReferencia1) {
		this.pontoReferencia1 = pontoReferencia1;
		lugar.setPontoReferencia(pontoReferencia1);
	}

	public Itinerario(String diaSemana, int dia, int mes, int ano, String nomeLugar1, String pontoReferencia1, boolean diaOuNoite, boolean chegadaOuSaida) {
		lugar.setNomeLugar(nomeLugar1);
		lugar.setPontoReferencia(pontoReferencia1);
		this.diaSemana = diaSemana;
		this.nomeLugar1 = nomeLugar1;
		this.pontoReferencia1 = pontoReferencia1;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaOuNoite = diaOuNoite;
		this.chegadaOuSaida = chegadaOuSaida;
	}

	public Itinerario() {

	}

	@Override
	public String toString() {
		return "Dia da Semana: " + diaSemana + " Lugar do Onibus: " + nomeLugar1 + "\n Ponto Referencial: " + pontoReferencia1 ;
	}

}
