package br.com.home.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.home.rh.ValidacaoExeption;
import br.com.home.rh.model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		final BigDecimal salarioAtual = funcionario.getSalario();
		final BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		
		if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoExeption("Reajuste não pode ser superior a 40% do salário");
		}
	}

}
