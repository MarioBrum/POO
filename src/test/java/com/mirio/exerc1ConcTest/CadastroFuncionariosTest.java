package com.mirio.exerc1ConcTest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import org.junit.Before;
import org.junit.Test;

public class CadastroFuncionariosTest {
    private CadastroFuncionarios cf;
    
    @Before
    public void inicializa(){
    	cf = new CadastroFuncionarios();
    }
    
	@Test
	public void testTam50() {
		assertThat(cf.retornaListaFuncionarios(),hasSize(50));
	}
	
	@Test
	public void nomesNaoVazios(){
		assertThat(cf.retornaListaFuncionarios(),hasItem(allOf(hasProperty("nome",notNullValue()))));
	}

	@Test
	public void matriculaMaior99(){
		assertThat(cf.retornaListaFuncionarios(),hasItem(allOf(hasProperty("matricula",greaterThan(99)))));
	}

	@Test
	public void testSemFilhosComInsalubridade(){
		assertThat(cf.retornaListaFuncionarios(),hasItem(allOf(hasProperty("insalubridade",is(true)),
				                               hasProperty("nroDependentes",is(0)))));
	}

	@Test
	public void testComFilhosSemInsalubridade(){
		assertThat(cf.retornaListaFuncionarios(),hasItem(allOf(hasProperty("insalubridade",is(false)),
				                               hasProperty("nroDependentes",greaterThan(0)))));
	}
}

