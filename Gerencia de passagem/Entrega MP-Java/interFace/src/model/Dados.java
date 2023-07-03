package model;


public class Dados {
	private Empresa emp = new Empresa();
	
	public Dados(){
		fillWithSomeData();
	}
	public void fillWithSomeData() {
		
		Onibus onib = new Onibus("Brasilia/Goias","MXU-5060","Amarela", 42);
		Onibus onib2 = new Onibus("Paraiba/Natal","CPO-2039","Branco", 45);
		Onibus onib3 = new Onibus("Mangueiral/Paranoa","JZT-4090","Preto", 45);
		Itinerario itin = new Itinerario("Segunda-Feira", 14, 05,2012, "Paranoa", "Escola", true, true);
		Itinerario itin2 = new Itinerario("Quinta-Feira", 19, 04, 2012, "Samambaia", "Metro", false, true);
		Itinerario itin3 = new Itinerario("Sábado", 20, 10, 2022, "Ceilandia", "Mercado", false, false);
		
		
		onib.setItinerario(itin);
		onib2.setItinerario(itin2);
		onib3.setItinerario(itin3);
		
		emp.setOnibus(onib);
		emp.setOnibus(onib2);
		emp.setOnibus(onib3);
		
		
	}
	
	public Empresa getEmpresa() {
		return emp;
	}
	public void setEmpresa(Empresa emp) {
		this.emp = emp;
	}
	
	
	
}
