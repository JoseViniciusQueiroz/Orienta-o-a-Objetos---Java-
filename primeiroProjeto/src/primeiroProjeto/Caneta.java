package primeiroProjeto;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " +this.cor + " do modelo " +this.modelo+ 
				" sua ponta e "+this.ponta+ "carga de "+this.carga);
	}
	void rabiscar() {
		if(tampada == true) {
			System.out.println("Erro");
		}
		else {
			System.out.println("Rabisco");
		}
	}
	
	void tampar() {
		tampada = true;
	}
	
	void destampar() {
		tampada = false;
	}

}
