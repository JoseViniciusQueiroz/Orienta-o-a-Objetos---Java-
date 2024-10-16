package metodosEspeciais;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	
	public void tampar() {
		this.setTampada(true);
	}
	public void destampar() {
		this.setTampada(false);
	}
	
	

	public Caneta(String m, float p, String c) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
		
	} 
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void Status() {
		System.out.println("Modelo: " +this.getModelo());
		System.out.println("Ponta: " +this.getPonta());
		System.out.println("Cor: " +this.getCor());
		System.out.println("tampada: " +this.getTampada() );
	}
	
	

}
