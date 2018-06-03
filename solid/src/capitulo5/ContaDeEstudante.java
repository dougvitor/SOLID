package capitulo5;

public class ContaDeEstudante extends ContaComum{
	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
	
	@Override
	public void rende() {
		throw new UnsupportedOperationException();
	}
}
