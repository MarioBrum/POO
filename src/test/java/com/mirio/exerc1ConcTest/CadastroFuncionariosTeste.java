package com.mirio.exerc1ConcTest;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Assert.assertThat;

public class CadastroFuncionariosTeste {
	@BeforeEach
	public void setup() {
		CadastroFuncionarios cf = new CadastroFuncionarios();
	}
	@Test
	 void tamanhoListaMaior50() {
		assertThat(cf.retornaListaFuncionarios().hasSize(greaterThan(50)));	
	}
	@Test
	void nomesNaoNulos() {
		CadastroFuncionarios cf = new CadastroFuncionarios();
		assertThar(cf.retornaListaFuncionarios(),hasItem(hasProperty("nome",notNullValue())));
	}

}
