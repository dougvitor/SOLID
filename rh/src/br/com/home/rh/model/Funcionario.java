package br.com.home.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	
	private String nome;
	
	private String cpf;
	
	private Cargo cargo;
	
	private BigDecimal salario;
	
	private LocalDate dataUltimoReajuste;
	
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}

}
