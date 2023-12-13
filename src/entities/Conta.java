package entities;

public class Conta {
	
	private Integer numero;
	private String nome;
	private Double montante;
	
	public Conta() {
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double initialDeposit) {
		this.numero = numero;
		this.nome = nome;
		deposito(initialDeposit);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMontante() {
		return montante;
	}

	public void deposito(double quantity) {
		 montante += quantity;
	}
	
	public void saque(double quantity) {
		this.montante -= quantity + 5.0;
	}
	
	public String toString() {
		return "Account "
				+numero
				+", Holder: "
				+nome
				+", Balance :"
				+String.format("%.2f", montante);		
	}
}
