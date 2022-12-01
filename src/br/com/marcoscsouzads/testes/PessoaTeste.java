package br.com.marcoscsouzads.testes;

import br.com.marcoscsouzads.entities.Aluno;
import br.com.marcoscsouzads.entities.Pessoa;
import br.com.marcoscsouzads.entities.Professor;

public class PessoaTeste {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("maria", 25, 5.4f, 6);
		
		Aluno a2 = new Aluno("mario", 23, 2.4f, 9);
		
		Professor p1 = new Professor("Rodrigo", 35, 3700.50f);
		Professor p2 = new Professor("Julio", 45, 4800.50f);
		
		Pessoa[] escola = new Pessoa[4];
		
		escola[0] = a1;
		escola[1] = p1;
		escola[2] = a2;
		escola[3] = p2;
		
		for (int i = 0; i < escola.length; i++) {
			
			
			System.out.println(escola[i]);
		}
		
		Aluno a3 = new Aluno("marcos", 25);
		System.out.println(a3);
		
		Professor p3 = new Professor("Antonio", 55);
		System.out.println(p3);

	}

}
