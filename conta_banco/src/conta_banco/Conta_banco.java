package conta_banco;

public class Conta_banco {

	public static void main(String[] args) {
Conta pessoa1 = new Conta();

pessoa1.setDono("André");
pessoa1.setNumero_conta(3264);
pessoa1.abrir_conta("cc");


pessoa1.informacao_conta();

pessoa1.depositar(50);

pessoa1.fechar_conta();




	}

}
