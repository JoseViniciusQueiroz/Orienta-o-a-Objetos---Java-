package visibilidade;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta " +this.cor + " do modelo " +this.modelo+ 
				" sua ponta e "+this.ponta+ " carga de "+this.carga);
	}
	public void rabiscar() {
		if(tampada == true) {
			System.out.println("Erro");
		}
		else {
			System.out.println("Rabisco");
		}
	}
	
	public void tampar() {
		tampada = true;
	}
	
	public void destampar() {
		tampada = false;
	}

}



