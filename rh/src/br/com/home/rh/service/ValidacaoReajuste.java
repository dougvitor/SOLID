package br.com.home.rh.service;

import java.math.BigDecimal;
import br.com.home.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(final Funcionario funcionario, final BigDecimal aumento);

}
