package br.com.home.rh.service;

import br.com.home.rh.ValidacaoExeption;
import br.com.home.rh.model.Cargo;
import br.com.home.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoExeption("Gerentes não podem ser promovidos!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		}else {
			throw new ValidacaoExeption("Funcionário não bateu a meta.");
		}
		
	}

}
