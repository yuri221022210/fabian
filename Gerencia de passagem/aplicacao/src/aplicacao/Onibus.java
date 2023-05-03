package aplicacao;

public class Onibus {
	private String marca;
	private String cor;
	private int numero;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Onibus(String marca, String cor, int numero){
		this.cor = cor;
		this.marca = marca;
		this.numero = numero;
		
		
	}
	
	public Onibus() {
		
	}
	
	
	
}
