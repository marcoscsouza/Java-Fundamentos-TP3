package br.com.marcoscsouzads;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import br.com.marcoscsouzads.entities.Aluno;
import br.com.marcoscsouzads.entities.Pessoa;
import br.com.marcoscsouzads.entities.Professor;
import br.com.marcoscsouzads.exceptions.DBMaximoException;

public class TP3 {
	
	private static Scanner sc = new Scanner(System.in);
	private static String menuOption;
	private static final int STUDENTS = 2;
	private static int idx = 0;

	private static Pessoa[] pessoas = new Pessoa[STUDENTS];

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Bem Vindo!!!");
		System.out.println("teste performance 3 - Cadastro de discentes/docentes ");

		try {
			showMenu();
			
		} catch (DBMaximoException e) {
			System.out.println(e.getMessage());
		} 

		sc.close();

	}
	
	private static void showMenu() throws DBMaximoException {

		do {
			System.out.println("");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("[1] Cadastrar professor"); 
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar situação de um docente/discente");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair");
			System.out.println("");

			System.out.print("Escolha: ");
			menuOption = sc.next();

			switch (menuOption) {
			case "1":
				if (idx < STUDENTS) {
					
					
				// Cadastrar professor
				System.out.print("Informe o seu nome: ");
				String nome = sc.next();
				
				System.out.print("Informe a sua idade: ");
				int idade = sc.nextInt();
				
				System.out.print("Informe o seu salário: ");	
				float salario = sc.nextFloat();
				
				Professor p1 = new Professor(nome, idade, salario);
				
				pessoas[idx] = p1;
				System.out.println("ID: "+ idx+  " - " +pessoas[idx].toString());
				idx++;
				}else {
					throw new DBMaximoException("Tamanho maximo! Impossivel cadastrar novos.");
				}
				
				break;
				
			case "2":
				if (idx < STUDENTS) {
					
				// Cadastrar aluno
				System.out.print("Informe o nome do aluno: ");
				String nomeAluno = sc.next();
				
				System.out.print("Informe a sua idade: ");
				int idadeAluno = sc.nextInt();
				
				Aluno a1 = new Aluno(nomeAluno, idadeAluno);
				
				try {
					System.out.print("Informe a primeira nota: ");
					float nota1 = sc.nextFloat();
					a1.setNota1(nota1);
					
					System.out.print("Informe a segunda nota: ");
					float nota2 = sc.nextFloat();
					a1.setNota2(nota2);
					
				} catch (InputMismatchException e) {
					System.out.println("Digite valores validos para as notas!");
					break;
					
				}
				
				
				pessoas[idx] = a1;
				System.out.println("ID: "+ idx+  " - " +pessoas[idx].toString());
				idx++;
			}else {
				throw new DBMaximoException("Tamanho maximo! Impossivel cadastrar novos.");
			}
				
				
				break;
				
			case "3":
				// Consultar situação de um docente/discente
				System.out.print("Informe o discente/docente para impressão: ");						
				int id = sc.nextInt();
				
				if(id >= 0 && id < idx) {
					
					System.out.println("ID: "+ id+  " - " +pessoas[id].toString());
					
					
				} else {
					System.out.println("O índice ["+id+"] é inválido!!!");
				}
				
				
				
				break;
				
			case "4":
				// Consultar Todos
				imprimir();
				
				break;
				
			case "5":
				// Sair
				
				break;
			default:
				System.out.println("Opção inválida, tente novamente!");
			}

		} while (!"5".equalsIgnoreCase(menuOption));

		System.out.println("Obrigado por utilizar nosso app, volte sempre!");
	}
	
	private static void imprimir() {
		int counter = 0;
		for (int i = 0; i < STUDENTS; i++) {
			if(pessoas[i] != null) {
				System.out.println("ID: "+ i+  " - " +pessoas[i].toString());
				counter++;
			}
			if (counter == 0) {
				System.out.println("Sem discentes/docentes cadastrados!");
			}
		}
	}



}
