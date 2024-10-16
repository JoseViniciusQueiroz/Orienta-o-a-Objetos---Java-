package exemploBanco;

public class exemploBanco {

	public static void main(String[] args) {
		Conta c1 = new Conta(86,"CC","Vinicius");
		Conta c2= new Conta(44,"CP","Payet");
		c1.abrirConta();
		c2.abrirConta();
		c1.pagarMensalidade();
		c2.pagarMensalidade();
	
		c1.status();
		c2.status();

	}

}
