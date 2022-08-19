package conta_banco;

public class Conta {
	 public int numero_conta;
	protected String tipo;
	 private String dono;
	 private float saldo;
	 private boolean status;
	public Conta() {

	}

public void informacao_conta()
{
System.out.println("O tipo de conta é " + this.getTipo());
System.out.println("O número da conta é" + this.getNumero_conta());
System.out.println("O dono da contaé " + this.getDono());
System.out.printf("O saldo atual da conta é de %.2f \n", + this.getSaldo());
if(this.getStatus() == true)
{
System.out.println("A conta está aberta");
}
else
{
System.out.println("A conta está fechada");
}
}




public void abrir_conta(String tipo)
{
this.setTipo(tipo);
this.setStatus(true);


if(tipo == "cc")
{
System.out.println("Uma conta corrente foi criada");
this.setSaldo(getSaldo() + 50);
}
else
{
if(tipo == "cp")
{
System.out.println("Uma conta polpança foi criada");
this.setSaldo(getSaldo() + 150);
}
}
}

public void fechar_conta()
{

if(this.getSaldo() > 0)
{
System.out.println("A conta não pode ser fechada pois ainda a dinheiro para ser sacado");
}
else
{
if(this.getSaldo() < 0)
{
System.out.println("A conta não pode ser fechada pois ela está em  débito ");
}
else
{
this.setStatus(false);
System.out.printf("A conta do tipo %s do dono %s foi fechada com   sucesso ",   this.getTipo(), this.getDono());
}
}
}

public void depositar(float valor)
{
if(this.getStatus() == true)
{
this.setSaldo(getSaldo() + valor);
System.out.printf("depósito realizado na conta de %s, no valor de %.2f \n",  this.getDono(), valor);
}
else
{  
System.out.println("Não é possível  depositar em uma conta fechada");
}
}

public void sacar(float valor)
{
if(this.getStatus() == true)
{
if(this.getSaldo() >=  valor)
{
System.out.printf("saque realizado com sucesso no valor de %.2f, na conta de %s \n", + valor, this.getDono());
this.setSaldo(getSaldo() - valor);
System.out.printf("Seu novo saldo é de %.2f \n", + this.getSaldo());

}
else
{
	System.out.println("Saldo insuficiente para sacar");
}
}

if(this.getStatus() == false)
{
System.out.println("Não é possível sacar em uma conta fechada");
}
}


public void pagar_mensalidade()
{
int mensalidade = 0;
if(this.getStatus() == true)
{
if(this.getTipo() == "cc")
{
mensalidade = 12;
this.setSaldo(getSaldo() - mensalidade);
System.out.println("Mensalidade paga com sucesso na conta de " + this.getDono());
}
else
{
if(this.getTipo() == "cp")
{
mensalidade = 20;
this.setSaldo(getSaldo() - mensalidade);
System.out.println(" mensalidade paga com sucesso na conta de " + this.getDono());
}
}
}
else
	System.out.println("Não é  possível pagar  numa conta fechada");
}





public int getNumero_conta() {
	return numero_conta;
}

public void setNumero_conta(int numero_conta) {
	this.numero_conta = numero_conta;
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





}


