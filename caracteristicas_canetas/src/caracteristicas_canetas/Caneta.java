package caracteristicas_canetas;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("estou rabiscando!!");
		} else {
			System.out.println("Estou tampada, e não posso rabiscar");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("Essa é uma caneta do modelo" + this.modelo);
		System.out.println("Ela é da cor" + this.cor);
		System.out.println("A ponta dessa caneta é " + this.ponta);
		System.out.printf("Ela está com %d %% de carga \n", this.carga);
		System.out.println("E ela está aberta?" + this.tampada);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public Caneta() {
		super();
		System.out.println("uma caneta foi criada");
		this.modelo = "big";
		this.cor = "azul";
		this.ponta = 0.5f;
		this.carga = 100;
		this.tampada = false;
	}

}
