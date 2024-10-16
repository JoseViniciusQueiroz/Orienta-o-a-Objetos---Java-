package exemploBanco;

public class Conta {
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	//construtor
	public Conta(int c, String t, String d) {
		this.setNumConta(c);
		this.setTipo(t);
		this.setDono(d);
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	//metodos 
	public void abrirConta() {
		if(this.getStatus()==false) {
			this.setStatus(true);
			if(this.getTipo()=="CC") {
				this.setSaldo(50);
			}
			else {
				this.setSaldo(100);
			}
		}
	}
	
	public void fecharConta() {
		if(this.getStatus()==true) {
			if(this.getSaldo()>0 || this.getSaldo()<0) {
				System.out.println("Ainda consta saldo de " +this.getSaldo()+ " na conta");
			}
			else {
				this.setStatus(false);
			}
		}
		else {
			System.out.println("Essa conta esta ja fechada");
		}
	}
	
	public void sacar(float v) {
		if(this.getSaldo()>=v) {
			this.setSaldo(this.getSaldo()- v);
			System.out.println("Saque feito");
		}
		else {
			System.out.println("nao foi possivel fazer o saque");
		}
		
	}
	
	public void depositar(float v) {
		this.setSaldo(this.getSaldo() + v);
	}
	
	public void pagarMensalidade() {
		if(this.getTipo()=="CC") {
			this.setSaldo(this.getSaldo() - 12);
		}
		else {
			this.setSaldo(this.getSaldo() - 20);
		}
	}
	
	
	//get e set 
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void status() {
		System.out.println(this.getDono());
		System.out.println(this.getNumConta());
		System.out.println(this.getTipo());
		System.out.println(this.getStatus());
		System.out.println(this.getSaldo());
		
	}
	
	
	
	
	

}
