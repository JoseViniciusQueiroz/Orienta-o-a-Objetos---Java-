package primeiroProjeto;

public class primeiroProjeto {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.carga = 100;
		c1.cor = "azul";
		c1.modelo = "BIC";
		c1.ponta = 2.0f;
		c1.tampar();
		c1.rabiscar();
		c1.destampar();
		c1.rabiscar();
		c1.status();

	}

}
