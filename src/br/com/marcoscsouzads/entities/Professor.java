package br.com.marcoscsouzads.entities;

public class Professor extends Pessoa  {
	
	private float salario;

	public Professor() {
		
	}
	
	public Professor(String nome, int idade) {
		super(nome, idade);
	}
	
	public Professor(String nome, int idade, float salario) {
		super(nome, idade);
		this.salario = salario;
	}
	
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() +
				";" +
				"Salário: " +
				salario;
	}
	

}
