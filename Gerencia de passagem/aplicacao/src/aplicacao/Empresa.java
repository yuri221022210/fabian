package aplicacao;

public class Empresa {

		private String nome;
		private long cnpj, telefone;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public long getNumero() {
			return telefone;
		}
		public void setNumero(long numero) {
			this.telefone = numero;
		}
		public long getCnpj() {
			return cnpj;
		}
		public void setCnpj(long cnpj) {
			this.cnpj = cnpj;
		}
		
		public Empresa(long cnpj, long telefone, String nome) {
			this.cnpj = cnpj;
			this.telefone = telefone;
			this.nome = nome;
		}
		public void cadastra() {
			
		}
		
		

	}

