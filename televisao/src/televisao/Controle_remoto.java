package televisao;

import java.util.Scanner;




public class Controle_remoto implements Controlador{

private int volume;
private boolean ligado;
	private boolean tocando;


Scanner teclado = new Scanner(System.in);

public Controle_remoto() {
	super();

this.setVolume(50);
this.setLigado(false);
this.setTocando(false);
}


public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}

public boolean getLigado() {
	return ligado;
}

public void setLigado(boolean ligado) {
	this.ligado = ligado;
}

public boolean getTocando() {
	return tocando;
}

public void setTocando(boolean tocando) {
	this.tocando = tocando;
}

@Override
public void menu_principal() { 
String opcao;
boolean verifica;


System.out.println("Escolha uma das op��es  do menu");
System.out.println("1. ligar televis�o \n"
		+ "2. desligar televis�o \n"
		+"3. almentar volume \n"
		+ "4. diminuir volume \n"
		+ "5. ativar mudo \n"
		+ "6. desativar mudo \n"
		+ "7. reproduzir m�dia\n"
		+ "8. pausar m�dia\n"
		+ "9. status da televis�o ");

verifica = false;
do
{
opcao = teclado.nextLine();

if(opcao.matches("\\d{2}") || ! opcao.equals("10"))
{
verifica = true;
}
else {
System.out.println("Erro");
verifica = false;
}

switch (opcao) {
case "1": {
ligar();
break;
}
case "2":{
desligar();
break;
}
case "3":{
mais_volume();
break;
}
case "4":{
menos_volume();
break;
}
case "5":{
	ligar_mudo();
	break;
}
case "6":{
desligar_mudo();
break;
}
case "7":{
tocar();
break;
}
case "8": {
pausar();
break;
}
case "9": {
mostrar_status();
break;
}
default: {
System.out.println("Erro, uma op��o que n�o existe foi selecionada \n digite novamente uma op��o do menu");
}
}
}while(! opcao.equals("2") ||  verifica ==  false);

}
@Override
public void ligar() {
	// TODO Auto-generated method stub

if(this.getLigado() == false)
{
this.setLigado(true);
System.out.println("Televis�o ligada");
}
else {
System.out.println("Erro, a televis�o j� est� ligada");
}

menu_principal();
}

@Override
public void desligar() {
	// TODO Auto-generated method stub

if(this.getLigado() == true)
{
this.setLigado(false);
System.out.println("Televis�o desligada");
}
else {
System.out.println("Erro, n�o � poss�vel desligar a televis�o pois ela j� est� desligada");
}
}

@Override
public void tocar() {

if(this.getLigado() == true)
{
if(this.getTocando() == false)
{
this.setTocando(true);
System.out.println("reproduzindo a m�dia");
}
else {
System.out.println("Erro, a m�dia j� est� tocando");
}
}
else {
System.out.println("Erro, n�o � poss�vel reproduzir a m�dia pois a televis�o est� desligada");
}

menu_principal();
}

@Override
public void pausar() {

if(this.getLigado() == true)
{
if(this.getTocando() == true)
{
this.setTocando(false);
System.out.println("A reprodu��o da m�dia foi paus�da");
}
else {
System.out.println("Erro, a m�dia j� foi pausada ");
}
}
else {
System.out.println("Erro, a televis�o est� desligada , nenhuma m�dia est� tocando");
}

menu_principal();

}

@Override
public void mais_volume() {

	if(this.getLigado() == true)
	{
	if(this.getVolume() < 100)
	{
	this.setVolume(getVolume() + 5);
System.out.println("volume almentado  para " + this.getVolume());
	}
	else {
	System.out.println("Erro,  o volume j� est� no m�ximo ");
	}
	}
	else {
	System.out.println("Erro, a televis�o est� desligada, n�o � poss�vel almentar o volume");
	}

menu_principal();


}

@Override
public void menos_volume() {

	if(this.getLigado() == true)
	{
	if(this.getVolume() >  0)
	{
	this.setVolume(getVolume() - 5);
System.out.println("O volume foi diminuido para " + this.getVolume());
	}
	else {
	System.out.println("Erro,  o volume j� est� no m�nimo n�o � poss�vel diminuir ");
	}
	}
	else {
	System.out.println("Erro, a televis�o est� desligada, n�o � poss�vel diminuir o volume");
	}

menu_principal();
}

@Override
public void ligar_mudo() {

if(this.getLigado() == true)
{
if(this.getVolume() > 0)
{
this.setVolume(0);
System.out.println("O mudo est� ativado ");
}
else {
System.out.println("Erro, o mudo j� est� ativado");
}
}
else {
System.out.println("Erro, a televis�o est� desligada, n�o � poss�vel ativar o mudo");
}

menu_principal();
}

@Override
public void desligar_mudo() {
if(this.getLigado() == true)
{
if(this.getVolume() == 0)
{
this.setVolume(50);
System.out.println("Mudo desativado");
}
else {
System.out.println("Erro, o mudo j� est� desativado");
}
}
else {
System.out.println("Erro, a televis�o est� desligada");
}

menu_principal();
}


@Override
public void mostrar_status() {

System.out.println("Status da televis�o");

System.out.println("Ela est� ligada ? " + this.getLigado());
System.out.println("Est� tocando alguma m�dia ?" + this.getTocando());
System.out.printf("O volume da televis�o est� em %d %% \n",  this.getVolume());
System.out.println("");

menu_principal();
}


}
