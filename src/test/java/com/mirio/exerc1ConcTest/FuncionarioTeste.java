package com.mirio.exerc1ConcTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.Parameters;
public class FuncionarioTeste {
	@Test
	@Parameters({"1999,0,false,1909,05",
				"2000,0,false,1910,0",})
	public void testINSS(int sBase,int nDep,boolean insalubridade,double result) {
		Funcionario f = new Funcionario(100,"João",sBase,nDep,insalubridade);
		assertEquals(result,f.getSalarioLiquido(),0.01);
	}
	
	
}
