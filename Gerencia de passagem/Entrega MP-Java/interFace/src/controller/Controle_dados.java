package controller;


import model.*;

public class Controle_dados {
	private Dados d;
	
	public Controle_dados(){
		d = new Dados();
		
	}
	public void Nome_emp(String nome,String cnpj,String numero) {
		d.getEmpresa().setNome(nome);
		d.getEmpresa().setCnpj(Long.parseLong(cnpj));
		d.getEmpresa().setNumero(Long.parseLong(numero));
		
	/*	System.out.println(d.getEmpresa().getNome());
		System.out.println(d.getEmpresa().getCnpj());
		System.out.println(d.getEmpresa().getNumero());*/
	}
	
	public void inf_onib(String nomelinh, String placa, String cor, String npoltronas) {
		Onibus oni = new Onibus( nomelinh,placa, cor,Integer.parseInt(npoltronas));
		d.getEmpresa().setOnibus(oni);
		
	//	System.out.print(d.getEmpresa().getOnibus(d.getEmpresa().getQtdOnibus()-1).getCor());
		
	}
	public void inf_int(String diaSemana, String dia, String mes, String ano, String nomeLugar, String pontoReferencia, boolean diaOuNoite, boolean chegadaOuSaida) {
		System.out.println(d.getEmpresa().getQtdOnibus());
		Itinerario iti = new Itinerario(diaSemana, Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano), nomeLugar, pontoReferencia, diaOuNoite, chegadaOuSaida);
		d.getEmpresa().getOnibus(d.getEmpresa().getQtdOnibus()-1).setItinerario(iti);
		System.out.println(d.getEmpresa().getOnibus(d.getEmpresa().getQtdOnibus()-1).getItinerarios());
	}
	public int[] busca(String dia, String mes, String ano) {
		for(int i = 0; i < d.getEmpresa().getQtdOnibus();i++) {
			for(int j = 0; j < d.getEmpresa().getOnibus(i).getItinerarios().size(); j++) {
				if(d.getEmpresa().getOnibus(i).getItinerario(j).setdia()== Integer.parseInt(dia)&&
					d.getEmpresa().getOnibus(i).getItinerario(j).setmes()== Integer.parseInt(mes)&&
						d.getEmpresa().getOnibus(i).getItinerario(j).setdano()== Integer.parseInt(ano)) {
						int[] itt= {i, j};
						return itt;
					
				}
			}
		
		}
		
		return null;
	}
	public Dados getDados() {
		return d;
	}
}
