package br.com.home.rh;

public class ValidacaoExeption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ValidacaoExeption(String mensagem) {
		super(mensagem);
	}
	

}
