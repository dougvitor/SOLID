package br.com.home.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	
	private DadosPessoais dadosPessoais;
	
	private LocalDate dataUltimoReajuste;
	
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
	
	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}

}
