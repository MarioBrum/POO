package com.mirio.exerc1ConcTest;

import java.util.LinkedList;
import java.util.Random;

public class CadastroFuncionarios {
	private LinkedList<Funcionario> funcionarios;
	public CadastroFuncionarios() {
		Random r = new Random();
		int matricula = 1;
		boolean insalubridade = false;
		String nome;
		double salario = r.nextDouble();
		int nroDependentes = r.nextInt(5);
		for(int i=0;i<100;i++) {
			nome = "funcionario" + matricula;
			if(nroDependentes > 0) {insalubridade = false;}
			Funcionario f = new Funcionario(matricula,nome,salario*10000,nroDependentes,insalubridade);
			matricula++;
			insalubridade = !insalubridade;
			nroDependentes = r.nextInt(5);
			salario = r.nextDouble();
			
			
		}
	}
	
	public void addFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	public boolean removeFuncionario(Funcionario f) {
		return funcionarios.remove(f);
		
	}
	
	public LinkedList<Funcionario> retornaListaFuncionarios(){
		return funcionarios;
		
	}

}
