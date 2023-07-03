package model;

import java.util.ArrayList;

public class Onibus {
	private String nomeLinha;
	private String cor;
	private String placa;
	private int numeroDePoltrona;
	
	private ArrayList<Itinerario> i = new ArrayList<Itinerario>();

	public Itinerario getItinerario(int novo_itn) {
		return i.get(novo_itn);
	}
	public void setItinerario(Itinerario novo_itn) {
		this.i.add(novo_itn);
	}
	public String getnomeLinha() {
		return nomeLinha;
	}
	public void setnomeLinha(String nomeLinha) {
		this.nomeLinha = nomeLinha;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumero() {
		return numeroDePoltrona;
	}
	public void setNumero(int numeroDePoltrona) {
		this.numeroDePoltrona = numeroDePoltrona;
	}
	public String getplaca() {
		return placa;
	}
	public void setplaca(String placa) {
		this.placa = placa;
	}
	public Onibus(String nomeLinha,String placa, String cor, int numeroDePoltrona){
		this.nomeLinha = nomeLinha;
		this.cor = cor;
		this.numeroDePoltrona = numeroDePoltrona;
		this.placa = placa;
		
	}
	public ArrayList<Itinerario> getItinerarios(){
		return i;
	}
	public Onibus() {
		
	}
	
	
	
}