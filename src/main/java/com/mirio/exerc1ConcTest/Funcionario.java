package com.mirio.exerc1ConcTest;

public class Funcionario {
	String nome;
	int matricula;
	int nroDependentes;
	boolean insalubridade;
	double salarioBase;
	public Funcionario(int matricula, String nome, double salarioBase,int nroDependentes, boolean insalubridade) {
		
	}
	public int getMatricula() {
		return matricula;     
		
	}
    public String getNome() {     
    	return nome;
    }
    public double getSalarioBase() {     
    	return salarioBase; 
    }
    public int getNroDependentes() {     
    	return nroDependentes;
    }
    public boolean getInsalubridade() {     
    	return insalubridade;
    }
    public double getSalarioBruto() {     
    	double valor = 0;
    	if(insalubridade) {valor = salarioBase + (salarioBase*0.1);}
    	else {valor = salarioBase;}
    	valor = valor + salarioBase + (0.01*nroDependentes);
    	return valor;
    }
    public double getSalarioLiquido() {     
    	//getSalarioBruto - 
    	double INSS = 0;
    	double impostoDeRenda = 0;
    	if(salarioBase>5000) {INSS = salarioBase*0.45;}
    	else {INSS= salarioBase*0.45;}
    	if(salarioBase<=2000) {impostoDeRenda = 0;}
    	else if(salarioBase>2000 && salarioBase<=5000) {impostoDeRenda=salarioBase*0.12;}
    	else if(salarioBase<5000) {impostoDeRenda=salarioBase*0.275;}
    	return ((salarioBase - INSS)- impostoDeRenda);
    }


}
