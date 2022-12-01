package br.com.marcoscsouzads.entities;

public class Aluno extends Pessoa {
	
	private float nota1;
	private float nota2;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}
	
	public Aluno(String nome, int idade, float nota1, float nota2) {
		super(nome, idade);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1)  {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	

	
	
	@Override
	public String toString() {
		return super.toString() +
				";" +
				"Nota 1: " + 
				nota1 +
				";" +
				"Nota 2: " +
				nota2 +
				";" +
				"Média final: " +
				this.mediaFinal();
	}

	private float mediaFinal()  {
		return (nota1 + nota2) / 2;
	}
	
	
	

}
